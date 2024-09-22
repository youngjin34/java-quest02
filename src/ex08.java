import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("난수를 생성합니다..");
    System.out.print("하한값: ");
    int a = scanner.nextInt();
    System.out.print("상한값: ");
    int b = scanner.nextInt();

    int result = random(a, b);
    System.out.println("난수는 " + result + "입니다.");

  }

  public static int random(int a, int b) {
    if (b <= a) {
      return a;
    }

    return a + (int) (Math.random() * (b - a + 1));
  }
}
