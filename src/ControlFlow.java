public class ControlFlow {
    public static void main(String[] args) {
        /** if statement
         * percabangan mengeksekusi kode jika kondisi terpenuhi
         */
        var syarat = 70;

        var nilaiA = 50;
        if (nilaiA >= syarat) {
            System.out.println("Selamat anda lulus!");
        } else {
            System.out.println("Maaf anda gagal!");
        }

        var nilaiB = 90;
        if (nilaiB >= syarat) {
            System.out.println("Selamat anda lulus!");
        } else {
            System.out.println("Maaf anda gagal!");
        }

        if (nilaiA >= syarat && nilaiB >= syarat) {
            System.out.println("Mereka lulus!");
//        } else if (nilaiA >= syarat || nilaiB >= syarat) {
//            System.out.println("Hanya satu orang yang lulus!");
        } else if (nilaiA >= syarat && nilaiB < syarat) {
            System.out.println("Hanya A yang lulus!");
        } else if (nilaiA < syarat && nilaiB >= syarat) {
            System.out.println("Hanya B yang lulus!");
        } else {
            System.out.println("Mereka gagal!");
        }
        System.out.println();

        /** Switch Statement
         * mirip dengan if statement, switch lebih sederhana
         */
        var nilai = "B";
//        var nilai = "T";
        switch (nilai) {
            case "A":
                System.out.println("Sempurna");
                break;
            case "B":
                System.out.println("Baik");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Sangat Kurang");
                break;
            default:
                System.out.println("Input salah!");
        }
    }
}
