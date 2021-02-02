public class BreakContinue {
    public static void main(String[] args) {
        /** Break & Continue
         * break digunakan untuk menghentikan case dalam switch, atau menghentikan perulangan
         * continue digunakan untuk menghentikan perulangan satu kali, dan melanjutkan perulangan selanjutnya
         */
        var counter = 1;
        while (true) {
            System.out.println("Counter-" + counter);
            counter++;
            if (counter > 10) break;
        }
        System.out.println();

        for (counter = 1; counter <= 20; counter++) {
            if (counter % 2 == 0) continue;
            System.out.println("Bilangan ganjil-" + counter);
        }
        System.out.println();

        for (counter = 1; counter > 0; counter++) {
            if (counter > 31) {
                break;
            } else {
                if (counter % 2 == 1) {
                    continue;
                } else {
                    System.out.println("Bilangan genap-" + counter);
                    counter++;
                }
            }
        }
    }
}
