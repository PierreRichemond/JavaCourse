public class App {
  public static void main(String[] args) {
    int firstHighScore = calculateScore(true, 800, 5, 100);
    System.out.println("The first high score is " + firstHighScore);
    int secondHighScore = calculateScore(true, 10000, 8, 200);
    System.out.println("The second high score is " + secondHighScore);
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;
    if (gameOver) {
      finalScore += (levelCompleted * bonus);
      finalScore += 1000;
    }
    return finalScore;
  }
}
