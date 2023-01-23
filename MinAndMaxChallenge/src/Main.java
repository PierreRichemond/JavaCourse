import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;

        boolean enterANumber= true;
        do {
            System.out.println("Enter a number, enter anything else to exit the programme.");
            try {
                String input = sc.nextLine();
                double number = Double.parseDouble(input);
                if (loopCount == 0 || min > number){min = number;};
                if (loopCount == 0 || max < number){max = number;};
                loopCount++;
            } catch(NumberFormatException nfe){
                enterANumber = false;
            };
        }while (enterANumber);

        System.out.println(loopCount + " is the number of time you entered a number");
        System.out.println("min = " + min + " ; max = " + max);
    }
}