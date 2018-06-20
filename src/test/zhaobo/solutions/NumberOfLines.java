package test.zhaobo.solutions;

/**
 * @program: testForLeetcode
 * @description: numberOfLines
 * @author: Mr.Zhao
 * @create: 2018-06-15 14:22
 **/
public class NumberOfLines {
    public  int[] numberOfLines(int[] widths, String S) {
        int num = 0;
        int line = 1;
        for (int i = 0; i < S.length(); i++) {
            int r = 0;
            switch (S.charAt(i)) {
                case 'a':
                    num += widths[0];
                    r += widths[0];
                    break;
                case 'b':
                    num += widths[1];
                    r += widths[1];
                    break;
                case 'c':
                    num += widths[2];
                    r += widths[2];
                    break;
                case 'd':
                    num += widths[3];
                    r += widths[3];
                    break;
                case 'e':
                    num += widths[4];
                    r += widths[4];
                    break;
                case 'f':
                    num += widths[5];
                    r += widths[5];
                    break;
                case 'g':
                    num += widths[6];
                    r += widths[6];
                    break;
                case 'h':
                    num += widths[7];
                    r += widths[7];
                    break;
                case 'i':
                    num += widths[8];
                    r += widths[8];
                    break;
                case 'j':
                    num += widths[9];
                    r += widths[9];
                    break;
                case 'k':
                    num += widths[10];
                    r += widths[10];
                    break;
                case 'l':
                    num += widths[11];
                    r += widths[11];
                    break;
                case 'm':
                    num += widths[12];
                    r += widths[12];
                    break;
                case 'n':
                    num += widths[13];
                    r += widths[13];
                    break;
                case 'o':
                    num += widths[14];
                    r += widths[14];
                    break;
                case 'p':
                    num += widths[15];
                    r += widths[15];
                    break;
                case 'q':
                    num += widths[16];
                    r += widths[16];
                    break;
                case 'r':
                    num += widths[17];
                    r += widths[17];
                    break;
                case 's':
                    num += widths[18];
                    r += widths[18];
                    break;
                case 't':
                    num += widths[19];
                    r += widths[19];
                    break;
                case 'u':
                    num += widths[20];
                    r += widths[20];
                    break;
                case 'v':
                    num += widths[21];
                    r += widths[21];
                    break;
                case 'w':
                    num += widths[22];
                    r += widths[22];
                    break;
                case 'x':
                    num += widths[23];
                    r += widths[23];
                    break;
                case 'y':
                    num += widths[24];
                    r += widths[24];
                    break;
                case 'z':
                    num += widths[25];
                    r += widths[25];
                    break;
                default:
                    break;
            }
            if (num > 100) {
                num = 0;
                line++;
                num += r;
            }
        }
        int[] a = {line, num};
        return a;
    }
}
