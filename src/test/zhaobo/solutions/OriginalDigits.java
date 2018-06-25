package test.zhaobo.solutions;

import java.util.Arrays;

/**
 * @program: testForLeetcode
 * @description: originalDigits
 * @author: Mr.Zhao
 * @create: 2018-06-25 10:12
 **/
public class OriginalDigits {
    public String originalDigits(String s) {
        //zero(z) one two(w) three four(u) five six(x) seven eight(g) nine
        //先将有特有字符的单词（02468）全部找出，之后再对13579依次找出
        StringBuilder sb = new StringBuilder(s);
        StringBuilder res = new StringBuilder();

            //0
            while (sb.indexOf("z") != -1){
                sb.deleteCharAt(sb.indexOf("z"));
                sb.deleteCharAt(sb.indexOf("e"));
                sb.deleteCharAt(sb.indexOf("r"));
                sb.deleteCharAt(sb.indexOf("o"));
                res.append("0");
            }

            //2
            while (sb.indexOf("w") != -1){
                sb.deleteCharAt(sb.indexOf("t"));
                sb.deleteCharAt(sb.indexOf("w"));
                sb.deleteCharAt(sb.indexOf("o"));
                res.append("2");
            }
            //4
            while (sb.indexOf("u") != -1){
                sb.deleteCharAt(sb.indexOf("f"));
                sb.deleteCharAt(sb.indexOf("o"));
                sb.deleteCharAt(sb.indexOf("u"));
                sb.deleteCharAt(sb.indexOf("r"));
                res.append("4");
            }

            //6
            while (sb.indexOf("x") != -1){
                sb.deleteCharAt(sb.indexOf("s"));
                sb.deleteCharAt(sb.indexOf("i"));
                sb.deleteCharAt(sb.indexOf("x"));
                res.append("6");
            }

            //8
            while (sb.indexOf("g") != -1){
                sb.deleteCharAt(sb.indexOf("e"));
                sb.deleteCharAt(sb.indexOf("i"));
                sb.deleteCharAt(sb.indexOf("g"));
                sb.deleteCharAt(sb.indexOf("h"));
                sb.deleteCharAt(sb.indexOf("t"));
                res.append("8");
            }

            //1
            while (sb.indexOf("o") != -1){
                sb.deleteCharAt(sb.indexOf("o"));
                sb.deleteCharAt(sb.indexOf("n"));
                sb.deleteCharAt(sb.indexOf("e"));
                res.append("1");
            }
            //3
            while (sb.indexOf("t") != -1){
                sb.deleteCharAt(sb.indexOf("t"));
                sb.deleteCharAt(sb.indexOf("h"));
                sb.deleteCharAt(sb.indexOf("r"));
                sb.deleteCharAt(sb.indexOf("e"));
                sb.deleteCharAt(sb.indexOf("e"));
                res.append("3");
            }
            //5
            while (sb.indexOf("f") != -1){
                sb.deleteCharAt(sb.indexOf("f"));
                sb.deleteCharAt(sb.indexOf("i"));
                sb.deleteCharAt(sb.indexOf("v"));
                sb.deleteCharAt(sb.indexOf("e"));
                res.append("5");
            }
            //7
            while (sb.indexOf("s") != -1){
                sb.deleteCharAt(sb.indexOf("s"));
                sb.deleteCharAt(sb.indexOf("e"));
                sb.deleteCharAt(sb.indexOf("v"));
                sb.deleteCharAt(sb.indexOf("e"));
                sb.deleteCharAt(sb.indexOf("n"));
                res.append("7");
            }
            //9
            for (int i = sb.length()/4;i > 0;i++){
                res.append("9");
            }
            char[] c = res.toString().toCharArray();
            Arrays.sort(c);
            return String.valueOf(c);
    }
}
