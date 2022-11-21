public class Main2 {
    public static void main(String[] args) {
        System.out.println(sum(Double.MAX_VALUE-5, 10));
        System.out.println(sum('t','e','s','t','c','h','a','r'));
    }

    static int sum(int... ints) {
        int sum = 0;
        for (int i : ints) {
            if (Integer.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    static short sum(short... shorts) {
        short sum = 0;
        for (short i : shorts) {
            if (Short.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    static boolean sum(boolean... booleans) {
        for (boolean i : booleans) {
            if (!i) {
                return false;
            }
        }
        return true;
    }

    static double sum(double... doubles) {
        double sum = 0d;
        for (double i : doubles) {
            if (Double.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    static long sum(long... longs) {
        long sum = 0L;
        for (long i : longs) {
            if (Long.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;

    }

    static String sum(char... chars) {
        return String.valueOf(chars);
    }

    static byte sum(byte... bytes) {
        byte sum = 0;
        for (byte i : bytes) {
            if (Byte.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;
    }

    static float sum(float... floats) {
        float sum = 0f;
        for (float i : floats) {
            if (Float.MAX_VALUE - sum - i < 0) {
                System.out.println("AAAAAAAAAAA!!!");
                return sum;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}
