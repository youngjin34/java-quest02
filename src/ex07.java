import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는: ");
    int num = scanner.nextInt();

    putChar(num);
  }

  public static void putChar(int num) {
    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
