/*
 * Short Circuit Operators
 * x && y - Y will be evaluated if and only if x is true. If x is false then y won't be evaluated
 * x || y - Y will be evaluated if and only if x is false i.e. if x is true then y won't be evaluated
 */
public class Main {
    public static void main(String[] args) {
        int x1, x2, x3, x4;
        x1 = x2 = x3 = x4 = 10;

        int y1, y2, y3, y4;
        y1 = y2 = y3 = y4 = 15;

        if (++x1 < 10 & ++y1 > 15) {
            x1++;
        } else {
            y1++;
        }
        System.out.println("& operator -> x1 = " + x1 + ", y1 = " + y1);

        if (++x2 < 10 && ++y2 > 15) {
            x2++;
        } else {
            y2++;
        }
        System.out.println("&& operator -> x2 = " + x2 + ", y2 = " + y2);

        if (++x3 < 10 | ++y3 > 15) {
            x3++;
        } else {
            y3++;
        }
        System.out.println("| operator -> x3 = " + x3 + ", y3 = " + y3);

        if (++x4 < 10 || ++y4 > 15) {
            x4++;
        } else {
            y4++;
        }
        System.out.println("|| operator -> x4 = " + x4 + ", y4 = " + y4);
    }
}