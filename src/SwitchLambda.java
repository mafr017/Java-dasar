public class SwitchLambda {
    public static void main(String[] args) {
        /** Switch Lambda
         * tidak perlu menggunakan break
         */
        var nilai = "B";

        switch (nilai) {
            case "A" -> System.out.println("Sempurna, anda lulus!");
            case "B", "C" -> System.out.println("Anda lulus!");
            case "D", "E" -> {
                System.out.println("Anda tidak lulus!");
            }
            default -> System.out.println("Salah input!");
        }

        /** nilai return Switch (yield)
         * mengembalikan nilai return dari switch statement, dengan kata kunci "yield"
         */
        // Contoh manual
        var nilai2 = "D";
        String ucapan;

        switch (nilai2) {
            case "A" -> ucapan = "Sempurna, anda lulus!";
            case "B", "C" -> ucapan = "Anda lulus!";
            case "D", "E" -> ucapan = "Anda tidak lulus!";
            default -> ucapan = "Salah input!";
        }
        System.out.println(ucapan);

        // contoh menggunakan yield
        var nilai3 = "A";
        String ucapan3;

        ucapan3 = switch (nilai3) {
            case "A":
                yield "Sempurna, anda lulus!";
            case "B", "C":
                yield "Anda lulus!";
            case "D", "E":
                yield "Anda tidak lulus!";
            default:
                yield "Salah input!";
        };
        System.out.println(ucapan3);
    }
}
