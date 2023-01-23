public class Main {
    public static void main(String[] args) {
        sumDigits(10001);
        sumDigits(123);
        sumDigits(-24);
        sumDigits(5);
    }
    public static int sumDigits(int n){
        if (n < 0){ return -1;};
        int length = Integer.toString(n).length();
        int loopingIndex = 0;
        int divisable = 1;
        int sum = 0;
        while (loopingIndex <= length){
            int number = (n/divisable) % 10;
            divisable *= 10;
            loopingIndex ++;
            sum += number;
        }
        System.out.println("the sum for "+ n + " is " + sum);
        return sum;
    }
}