public class MethodOverloading {
    public static void main(String[] args) {
        /** Method Overloading
         * membuat method dengan nama yang sama, tetapi parameter berbeda-beda / jumlahnya berbeda-beda
         */
        sayHello();
        sayHello("Adit");
        sayHello("Muhammad Aditya", "Fathur Rahman");
    }

    static void sayHello() {
        System.out.println("Hello!");
    }
    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
