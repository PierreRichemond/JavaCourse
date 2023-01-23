public class Main {
    public static void main(String[] args) {
        int number = 4;
        int totalOddNumber = 0;
        int totalEvenNumber = 0;
        while(number <= 20){
            number++;
            if (!isEvenNumber(number)){
                totalOddNumber++;
                continue;
            }
            totalEvenNumber++;
            System.out.println(number + " is an even Number");
            if (totalEvenNumber >= 5){
                System.out.println("We reached 5 even numbers, Code execution stops");
                break;
            }
        }
        System.out.println(totalEvenNumber + " is the total of even Number");
        System.out.println(totalOddNumber + " is the total of odd Number");
    }
    public static boolean isEvenNumber(int n){
       boolean result = (n % 2 == 0) ? true : false ;
        return result;
    };
}