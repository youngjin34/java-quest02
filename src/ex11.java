import java.util.Random;
import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("암산 훈련");

    while (true) {
      int correctAnswer = askQuestion(random);

      int userAnswer = getUserAnswer(scanner);

      checkAnswer(correctAnswer, userAnswer);

      if (!retry(scanner)) {
        break;
      }
    }

    System.out.println("프로그램을 종료합니다.");
  }

  public static int askQuestion(Random random) {
    int x = 100 + random.nextInt(900);
    int y = 100 + random.nextInt(900);
    int z = 100 + random.nextInt(900);

    int problemType = random.nextInt(4);
    String problem = "";
    int correctAnswer = 0;

    switch (problemType) {
      case 0:
        correctAnswer = x + y + z;
        problem = x + " + " + y + " + " + z + " = ";
        break;
      case 1:
        correctAnswer = x + y - z;
        problem = x + " + " + y + " - " + z + " = ";
        break;
      case 2:
        correctAnswer = x - y + z;
        problem = x + " - " + y + " + " + z + " = ";
        break;
      case 3:
        correctAnswer = x - y - z;
        problem = x + " - " + y + " - " + z + " = ";
        break;
    }

    System.out.print(problem);
    return correctAnswer;
  }

  public static int getUserAnswer(Scanner scanner) {
    return scanner.nextInt();
  }

  public static void checkAnswer(int correctAnswer, int userAnswer) {
    if (userAnswer == correctAnswer) {
      System.out.println("정답입니다!");
    } else {
      System.out.println("틀렸습니다");
      System.out.println("정답은 " + correctAnswer + "입니다.");
    }
  }

  public static boolean retry(Scanner scanner) {
    System.out.print("다시 한 번<Yes_1/No_0>: ");
    int retry = scanner.nextInt();
    return retry == 1;
  }
}
