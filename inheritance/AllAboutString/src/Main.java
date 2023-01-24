public class Main {
    public static void main(String[] args) {

        printInformation("");
        printInformation("  ");
        printInformation("Hello world");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r')); //8
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World")); // 6
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l')); // 2
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l')); //9
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3)); // 3
        System.out.printf("Last index of l = %d %n", helloWorld.lastIndexOf('l', 8)); //3

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("values match ignoring cases");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("Starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("Ends with World");
        }
        if (helloWorld.contains("lo Wor")){
            System.out.println("Contains with 'lo Wor'");
        }
        if (helloWorld.contentEquals("Hello World")){
            System.out.println("values match exactly");
        }
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.printf("String is empty %n");
            return;
        }
        if (string.isBlank()){
            System.out.printf("String is blank %n");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length -1));

    }
}