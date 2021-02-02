public class ForEach {
    public static void main(String[] args) {
        /** for each
         * biasanya digunakan untuk array
         */
        String[] array1 = {"Muhammad", "Aditya", "Fathur", "Rahman", "Belajar", "Java"};

        // tidak efektif
        var lengtha = array1.length;
        for (var i = 0; i < lengtha; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // menggunakan for each lebih sederhana
        for (var value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
