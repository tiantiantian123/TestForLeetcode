package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: toGoatLatin
 * @author: Mr.Zhao
 * @create: 2018-06-22 10:21
 **/
public class ToGoatLatin {
    public String toGoatLatin(String S) {
        String finalRes = new String();
        String[] res = S.split(" ");
        for (int i = 0;i < res.length;i++){
            if (isVowel(res[i].charAt(0))){
                res[i] = res[i] + "ma";
            }

            else {
                StringBuilder sb = new StringBuilder(res[i]);
                String temp = sb.substring(0,1);
                sb.deleteCharAt(0);
                sb.append(temp);
                res[i] = sb + "ma";
            }
            for (int k = i;k >= 0;k--){
                res[i] += "a";
            }
        }
        for (int m = 0;m < res.length;m++){
            if (m != res.length-1)
                finalRes = finalRes + res[m] + " ";
            else finalRes += res[m];
        }
        return finalRes;
    }

    public boolean isVowel(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        else return false;
    }
}
