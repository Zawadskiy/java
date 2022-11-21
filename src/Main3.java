public class Main3 {
    public static void main(String[] args) {
        System.out.println(fact(-5L));
    }
    static long fact(long value) {
        if (value <1L) {
            System.out.println("0_0");
            System.exit(0);
        }
        if (value > 1) {
            return value * fact(value-1);
        }
        return value;
    }
}
