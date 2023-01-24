public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "24/11/1990";
        int yearIndex = birthDate.indexOf("1990");
        System.out.println("yearIndex = " + yearIndex);
        System.out.println("birthYear = " + birthDate.substring(yearIndex));

        String month = birthDate.substring(3, 5); // 11
        System.out.println("birthYear = " + month);
        String day = birthDate.substring(0, 2); // 24
        System.out.println("birthYear = " + day);
        String year = birthDate.substring(yearIndex);

        System.out.println(String.join("/", day, month, year)); // 24/11/1990
        System.out.println(birthDate.replace("/", "-")); // 24-11-1990

        System.out.println(birthDate.replaceFirst("/", "-")); // 24-11/1990

        System.out.println("ABC\n".repeat(3));
//        ABC
//        ABC
//        ABC
        System.out.println("-".repeat(20)); //--------------------

        System.out.println("ABC\n".repeat(3).indent(8));
//                ABC
//                ABC
//                ABC
        System.out.println("-".repeat(20)); //--------------------
    }
}
