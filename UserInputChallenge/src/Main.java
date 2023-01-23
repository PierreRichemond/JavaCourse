import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberAmount = 0;
        double sum = 0;
        do {
            System.out.println("Enter a number");
            try {
                String input = scanner.nextLine();
//                int intInput = Integer.parseInt(input);
                double intInput = Double.parseDouble(input);
                sum += intInput;
                numberAmount++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (numberAmount < 5 );
        System.out.println(sum + " is the sum of all your numbers");
    }
}