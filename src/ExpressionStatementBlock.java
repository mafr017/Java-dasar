import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        /** Expression
         * kontruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi single value
         */
        int value;
        value = 10;
        System.out.println(value = 100);
        System.out.println();

        /** Statement
         * bisa dibilang kalimat lengkap dalam bahasa
         * ber-isikan expression komplit
         */
        // assignment statement
        double aValue = 32432.324;
        // increment statement
        aValue++;
        // method invocation statement
        System.out.println("Hello World!");
        // object creation statement
        Date date = new Date();

        /** Block
         * kumpulan statement yang terdiri dari nol atau lebih statement
         * diawali "{" dan diakhiri "}"
         */
        int a = 1;
        {
            System.out.println("Hello Wold " + a++);
            System.out.println("Hello Wold " + a++);
            System.out.println("Hello Wold " + a++);
        }
        
        System.out.println("Hello Wold " + a++);
        System.out.println("Hello Wold " + a++);

    }
}
