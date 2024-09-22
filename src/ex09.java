import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) throws Exception {
    readPlusInt();
  }

  public static void readPlusInt() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("1: 계속, 0: 종료 > ");
      int command = scanner.nextInt();

      if (command == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (command == 1) {
        int reverse = 0;

        while (true) {
          System.out.print("양의 정숫값: ");
          int a = scanner.nextInt();

          if (a > 0) {
            while (a > 0) {
              int digit = a % 10;
              reverse = reverse * 10 + digit;
              a /= 10;
            }
            System.out.println("입력한 정수의 역순은: " + reverse);
            break;
          } else {
            System.out.println("양수를 입력하세요!");
          }
        }
      } else {
        System.out.println("잘못된 입력입니다. 1 또는 0을 입력하세요.");
      }
    }
  }
}
