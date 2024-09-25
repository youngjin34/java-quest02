import java.util.Scanner;

public class ex12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수 x를 입력하세요: ");
    int x = scanner.nextInt();

    System.out.print("n 값을 입력하세요: ");
    int n = scanner.nextInt();

    int multiplyResult = x * (int) Math.pow(2, n);
    int leftShiftResult = x << n;

    int divideResult = x / (int) Math.pow(2, n);
    int rightShiftResult = x >> n;

    System.out.println("[a] x * (2의 " + n + "승) = " + multiplyResult);
    System.out.println("[b] x / (2의 " + n + "승) = " + divideResult);
    System.out.println("[c] x << " + n + " = " + leftShiftResult);
    System.out.println("[d] x >> " + n + " = " + rightShiftResult);

    if (multiplyResult == leftShiftResult) {
      System.out.println("[a]와 [c]의 값이 일치합니다.");
    } else {
      System.out.println("[a]와 [c]의 값이 일치하지 않습니다.");
    }

    if (divideResult == rightShiftResult) {
      System.out.println("[b]와 [d]의 값이 일치합니다.");
    } else {
      System.out.println("[b]와 [d]의 값이 일치하지 않습니다.");
    }

  }
}
