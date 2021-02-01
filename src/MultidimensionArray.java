public class MultidimensionArray {
    public static void main(String[] args) {
        String[][] members = {
                {"Muhammad", "Aditya", "Fathur", "Rahman"},
                {"Java", "Kotlin", "Python"},
                {"Bandung", "Cimahi"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);

        String[] member1 = members[0];
        System.out.println(member1[3]);
    }
}
