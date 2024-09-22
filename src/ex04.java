import java.util.Scanner;

public class ex04 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1부터 x 까지의 합을 구하자");
    System.out.print("x의 값: ");
    int x = scanner.nextInt();

    sumUp(x);

  }

  public static void sumUp(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
  }
}
