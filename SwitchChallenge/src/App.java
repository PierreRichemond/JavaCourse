public class App {
    public static void main(String[] args) {
      dayOfWeek(0);
      dayOfWeek(1);
      dayOfWeek(2);
      dayOfWeek(3);
      dayOfWeek(4);
      dayOfWeek(5);
      dayOfWeek(6);
      dayOfWeek(7);
    }

    public static void dayOfWeek(int day) {
        String weekDay = switch (day) {
        case 0 -> { yield "Sunday";}
        case 1 -> "Monday";
        case 2 -> "Thuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        default -> "Invalid day";
        };
        System.out.println(day + " stands for " + weekDay);
    }
}
