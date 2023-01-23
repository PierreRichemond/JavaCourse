public class App {
  public static void main(String[] args) {

  }

 public static boolean hasTeen(int first, int second, int third){
     if (isTeen(first) || isTeen(second) || isTeen(third)) {
        return true;
     }
     return false;
 }

  public static boolean isTeen(int age){
     boolean result = (age >= 13 && age <= 19) ? true : false;
     return result;
 }
}
