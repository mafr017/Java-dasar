public class PerulanganForWhile {
    public static void main(String[] args) {
        /** For loop
         */
//        int i = 1;
//        for(; i <= 5 ;) {
//            System.out.println("Hello World " + i + "!");
//            i++;
//        }

        for(int ij = 1; ij <= 5; ij++) {
//        for(var ij = 1; ij <= 5; ij++) {
            System.out.println("Hello World " + ij + "!");
        }
        System.out.println();

        /** While loop
         */
        var counter = 1;
        while (counter <= 5) {
            System.out.println(counter);
            counter++;
        }
        System.out.println();

        /** Do While loop
         * pengecekan kondisi dilakukan setelah blok kode
         * do while loop pasti melakukan perulangan sekali walupun kondisi salah
         */
        var counter2 = 1;

        do {
            System.out.println("Counter do while loop-" + counter2);
            counter2++;
        } while (counter2 <= 10);

    }
}
