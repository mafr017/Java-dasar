public class KonversiTipeData {
    public static void main(String[] args) {
        /**
         * widening casting (otomatis) : byte -> short -> int -> long -> float -> double
         * Narrowing casting (manual) : double -> float -> long -> int -> short -> byte
         */
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;
        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniFloat);
        System.out.println(iniDouble);

        System.out.println();

        int iniInt2 = 100;
//        int iniInt2 = 1000;       // akan terkena number overflow
        byte iniByte2 = (byte) iniInt2;
        System.out.println(iniInt2);
        System.out.println(iniByte2);
    }
}
