public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
//        String[] arrayString2 = new  String[4];
        arrayString = new String[3];
        arrayString[0] = "Aditya";
        arrayString[1] = "Java";
        arrayString[2] = "Kotlin";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Belajar";
        System.out.println(arrayString[0]);
        System.out.println(arrayString.length);

        System.out.println();

        int[] arrayInt = new int[] {
                10, 2, 324, 21, 55, 7866
        };
        System.out.println(arrayInt[4]);
        System.out.println(arrayInt.length);

        Long[] arrayLong = {
                44_444L, 2_324L, 3242L, 23423L, 3243L
        };
        System.out.println(arrayLong[3]);
        System.out.println(arrayLong.length);
        arrayLong[0] = 0L;
        System.out.println(arrayLong[0]);
        arrayLong[0] = null;
        System.out.println(arrayLong[0]);

        String[] arrayString2 = {"Muhammad", "Aditya", "Fathur", "Rahman"};
        System.out.println(arrayString2.length);

    }
}
