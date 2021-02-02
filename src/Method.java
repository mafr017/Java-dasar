public class Method {
    public static void main(String[] args) {
        /** Method (Function)
         * block code program yang akan dieksekusi saat dipanggil
         * untuk membuat method gunakan kata kunci "void" lalu diikuti dengan nama method yang..
         * ..diinginkan dan tanda "()"
         */
        sayHelloWorld();
        sayName("Muhammad Aditya", "Fathur Rahman");
//        var result = sumAB(3, 5);
        System.out.println( sumAB(3, 5) );
        var hasil = hitung(4,'-', 7);
        System.out.println( hasil );
        System.out.println( hitung(5, '*', 9) );
    }

    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    static void sayName(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // untuk mengembalikan return value method void harus diubah dengan tipe data return value
    static int sumAB(int valueA, int valueB) {
//        var result = valueA + valueB;
//        return result;
        return valueA + valueB;
    }

    static int hitung(int valueA, char operasi, int valueB) {
        switch (operasi) {
            case '+':
                return valueA + valueB;
            case '-':
                return valueA - valueB;
            default:
                return 0;
        }
    }
}
