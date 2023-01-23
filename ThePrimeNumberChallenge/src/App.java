public class App {
    public static void main(String[] args) throws Exception {
      int primeCount = 0;
      for (int i = 10; primeCount < 3 && i <= 1000; i++){
        if (isPrime(i)) {
          System.out.println("Number " + i + " is a prime number");
          primeCount++;
        }
      }
    }

    public static boolean isPrime(int n) {
      if (n <= 2) {return n == 2;};
      for(int divisor = 2; divisor < n; divisor++){
        if (n % divisor == 0){
          return false;
        }
      };
      return true;
    }
}
