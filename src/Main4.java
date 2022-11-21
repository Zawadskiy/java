public class Main4 {
    private static final int start = 1;

    public static void main(String[] args) {
        System.out.println(foo(0, start));
    }

    static double foo(int n, int start) {

        if (n < 1) {
            System.out.println("n<1");
            System.exit(0);
        }

        if (start < n) {
            return Math.sqrt(start + foo(n, ++start));
        }

        return Math.sqrt(start);
    }
}
