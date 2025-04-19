public class APLine {
    /* your code here */
    int foo, bar, baz;

    public APLine(int a, int b, int c) {
        foo = a;
        bar = b;
        baz = c;
    }

    public double getSlope() {
        return -foo / bar;
    }

    public boolean isOnLine(int x, int y) {
        return foo*x + bar*y + baz = 0;
    }
}
