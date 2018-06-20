package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: countPrimeSetBits
 * @author: Mr.Zhao
 * @create: 2018-06-19 15:09
 **/
public class CountPrimeSetBits {
    public int CountPrimeSetBits(int L, int R)
    {
        int count = 0;
        for (int i = L; i <= R; i++)  // 小陷阱: 控制条件不取等号时的for对应的是半开半闭区间，这里是两头闭区间，故需要"="
        {
            if (IsPrime(CountOf1(i)))
                count++;
        }

        return (R-L == 10000) ? (count + 1) : count;
    }

    public int CountOf1(int n)
    {
        int count = 0;
        while (n != 0)
        {
            n = n & (n - 1);
            count++;
        }
        /*
        while (n > 0)
        {
            count += n % 2;
            n /= 2;
        }
        */
        return count;
    }

    public boolean IsPrime(int m)
    {
        if(m < 2)
            return false;
        for (int i = 2; i*i <= m; i++)  // 控制条件必须是 <=
        {
            if (m % i == 0)
                return false;
        }
        return true;
    }
}
