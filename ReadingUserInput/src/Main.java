import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch( NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What's your date of birth ? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi what's your name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", thanks for taking the course!");
        boolean validDob = false;
        int age = 0;
        System.out.println("What's your date of birth ? ");
        do {
            try{
                System.out.println("Enter a date between " + (currentYear-125) + " and " + (currentYear));
                age = checkData(currentYear, sc.nextLine());
                if (age >= 0){validDob = true;}
             } catch (NumberFormatException badInput){
                System.out.println("Characters not allowed!!!, enter a valid date like: 1990");
            }

        } while (!validDob);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }
        return currentYear - dob;
    }
}