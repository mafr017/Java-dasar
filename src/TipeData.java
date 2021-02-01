public class TipeData {
    public static void main(String[] args) {

        byte iniByte = 100;                 // 1 byte       -128  sampai 127
        short iniShort = 1_000;             // 2 bytes      -32,768 sampai 32,768
        int iniInt = 1_000_000;             // 4 bytes      -2.1 Jt sampai 2.1 Jt
        long iniLong = 1_000_000_000_000L;  // 8 bytes
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);

        float iniFloat = 3.1415F;           // 4 bytes
        double iniDouble = 1234.3242;       // 8 bytes
        System.out.println(iniFloat);
        System.out.println(iniDouble);

    }
}
