public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /** Tipe Data Bukan Primitif
         * diawali dengan huruf besar long -> Long
         */
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        // Konversi dari tipe data primitif
        int age = 22;
        System.out.println(age);

        Integer ageObject = age;
        System.out.println(ageObject);

        int ageAgain = ageObject;
        System.out.println(ageAgain);

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        System.out.println(shortAge);
        System.out.println(byteAge);

    }
}
