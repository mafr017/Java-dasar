public class RecursiveMethod {
    public static void main(String[] args) {
        /** Recursive Method
         * memanggil method dirinya sendiri
         */
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }
    static int factorialLoop(int value) {
        var result = 1;
        for(var i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // recursive method
    static int factorialRecursive(int value) {
        if (value == 1) {
            System.out.print(value + " = ");
            return value;
        } else {
            System.out.print(value + " x ");
            return value * factorialRecursive(value - 1);
        }
    }
}
