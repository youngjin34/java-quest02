import java.util.Scanner;

public class ex03 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수 a: ");
    int a = scanner.nextInt();
    System.out.print("정수 b: ");
    int b = scanner.nextInt();
    System.out.print("정수 c: ");
    int c = scanner.nextInt();

    int result = medium(a, b, c);
    System.out.println("중간값은 " + result + "입니다.");
  }

  public static int medium(int a, int b, int c) {
    if ((a >= b && a <= c) || (a <= b && a >= c)) {
      return a;
    } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
      return b;
    } else {
      return c;
    }
  }
}
