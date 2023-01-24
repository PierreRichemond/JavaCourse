public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a bulleted list: \n"
                +"\t\u2022 First point \n"
                +"\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Prints a bulleted list as well
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d\n", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Your birth year is %d%n", yearOfBirth);
//Your birth year is 1988
//
        System.out.printf("Your age is %.2f%n", (float)age);
//Your age is 35.00
        //
        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d%n", i);
//            Printing      1
//            Printing     10
//            Printing    100
//            Printing   1000
//            Printing  10000
//            Printing 100000
            //

            System.out.printf("Printing %d%n", i);
//            Printing 1
//            Printing 10
//            Printing 100
//            Printing 1000
//            Printing 10000
//            Printing 100000
            //
        }
    }
}