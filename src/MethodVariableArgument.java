public class MethodVariableArgument {
    public static void main(String[] args) {
        /** Method Variable Argument
         * digunakan untuk mengirim data yang jumlah datanya tak tentu
         * ditempatkan pada parameter akhir
         */
        int[][] value= {
            {60, 70, 80, 99, 100},
            {100, 80, 60, 59, 40, 30}
        };
        hitungRataRata("Aditya", value[0]); //tanpa variable argument
        hitungRataRata("Bob", value[1]);    //tanpa variable argument
        hitungRataRata2("Jane", 90, 100, 80, 100);

    }

    // tanpa variable argument
    static void hitungRataRata(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 70) {
            System.out.println("Selamat " + name + ", anda lulus!");
        } else {
            System.out.println("Selamat " + name + ", anda tidak lulus!");
        }
    }

    // menggunakan variable argument
    static void hitungRataRata2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 70) {
            System.out.println("Selamat " + name + ", anda lulus!");
        } else {
            System.out.println("Selamat " + name + ", anda tidak lulus!");
        }
    }
}
