public class App {
    public static void main(String[] args) throws Exception {
      System.out.println(getDurationString(-722));
      System.out.println(getDurationString(-12, 2));
      System.out.println(getDurationString(12, 112));
    }

    public static String getDurationString(int seconds) {
      if (seconds < 0){
        return "Invalid data for Seconds (" + seconds + "), must be a positive integer value";
      }
      int hours = seconds / 3600;
      int minutes = (seconds % 3600) / 60;
      int secondsLeft = seconds % 60;
      return hours + "h " + minutes + "m " + secondsLeft + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
      if (minutes < 0) {
        return "Invalid data for Minutes (" + minutes + "), must be a positive integer value";
      }
      if (seconds < 0 || seconds >= 60) {
        return "Invalid data for Seconds (" + seconds + "), must be between 0 and 59";
      }
      int totalSeconds = 60 * minutes + seconds;
      return getDurationString(totalSeconds);
    }
}
