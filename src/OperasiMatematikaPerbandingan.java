public class OperasiMatematikaPerbandingan {
    public static void main(String[] args) {
        System.out.println(2 + 2);
        System.out.println(4 - 3);
        System.out.println(1 - 3);
        System.out.println(2 * 3);
        System.out.println(10 / 2);
        System.out.println((double) 10 / 4);
        System.out.println(10 % 3);

        System.out.println();

        double a = 12;
        double b = 4;
        double c = 0;

        c += a;
        System.out.println(a);

        a -= b;
        System.out.println(a);

        c /= b;
        System.out.println(c);

        c %= b;
        System.out.println(c);

        System.out.println();

        int d = 0;
//        d++;
//        d--;
        System.out.println(++d);
        System.out.println(++d);
        System.out.println(++d);
        System.out.println(--d);
        System.out.println(-d);

        System.out.println();

        System.out.println(!true);
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(!(false && false));
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(true || true);

        System.out.println();

        System.out.println(1 > 2);
        System.out.println(1 < 2);
        System.out.println(1 >= 2);
        System.out.println(1 <= 2);
        System.out.println(1 == 2);
        System.out.println(2 == 2);
    }
}
