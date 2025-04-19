public class APLine {
    /* your code here */
    int foo, bar, baz;

    public APLine(a, b, c) {
        foo = a;
        bar = b;
        baz = c;
    }

    public double getSlope() {
        return -a / b;
    }

    public boolean isOnLine(x, y) {
        return a*x + b*y + c = 0;
    }
}
