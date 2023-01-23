public class App {
  public static void main(String[] args) {
System.out.println(convertToCentimeters(68));
System.out.println(convertToCentimeters(5, 8));
  }

  public static double convertToCentimeters(int inches) {
    double heightInCentimeters = inches * 2.54;
    return heightInCentimeters;
  }

  public static double convertToCentimeters(int heightInFeet, int remainingInInches) {
    int totalInches = 12 * heightInFeet + remainingInInches;
    double heightInCentimeters = convertToCentimeters(totalInches);
    return heightInCentimeters;
  }
}
