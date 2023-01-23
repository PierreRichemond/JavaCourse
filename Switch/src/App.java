public class App {
    public static void main(String[] args) throws Exception {
        int switchValue = 20;

      switch (switchValue) {
        case 1 -> System.out.println("The value was 1");
        case 2 -> System.out.println("The value was 2");
        case 3, 4, 5 -> {
          System.out.println("The value is 3 or 4 or 5");
          System.out.println("Actually it was a " + switchValue);
        }
        default-> System.out.println("The value was not 1, 2, 3, 4, 5");
      }
    }

    public static String getQuarter(String month){
      return switch (month) {
        case "January", "February", "March" -> "First quarter";
        case "April", "May", "June" -> "Second quarter";
        case "July", "August", "September" -> "Third quarter";
        case "October", "November", "December" -> "Fourth quarter";
        default -> "Bad";
      };
    }
}
