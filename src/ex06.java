import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("몇 월입니까?(1~12): ");
    int month = scanner.nextInt();

    printSeason(month);

  }

  public static void printSeason(int month) {
    if (month == 12 || (month >= 1 && month <= 2)) {
      System.out.println("해당 월의 계절은 겨울입니다.");
    } else if (month >= 3 && month <= 5) {
      System.out.println("해당 월의 계절은 봄입니다.");
    } else if (month >= 6 && month <= 8) {
      System.out.println("해당 월의 계절은 여름입니다.");
    } else if (month >= 9 && month <= 11) {
      System.out.println("해당 월의 계절은 가을입니다.");
    } else {
      return;
    }

  }
}
