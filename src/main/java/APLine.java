public class APLine {
    /* your code here */
    int foo, bar, baz;

    public APLine(int a, int b, int c) {
        foo = a;
        bar = b;
        baz = c;
    }

    public double getSlope() {
        return -a / b;
    }

    public boolean isOnLine(int x, int y) {
        return a*x + b*y + c = 0;
    }
}
