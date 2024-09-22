import java.util.Scanner;

public class ex02 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수 a: ");
    int a = scanner.nextInt();
    System.out.print("정수 b: ");
    int b = scanner.nextInt();
    System.out.print("정수 c: ");
    int c = scanner.nextInt();

    int result = min(a, b, c);
    System.out.println("최솟값은 " + result + "입니다.");
  }

  public static int min(int a, int b, int c) {
    int minValue = a;
    if (b < minValue) {
      minValue = b;
    }
    if (c < minValue) {
      minValue = c;
    }

    return minValue;
  }
}
