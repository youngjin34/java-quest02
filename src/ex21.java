import java.util.Scanner;

public class ex21 {
  public static void aryExchange(int[] a, int[] b) {
    int length = Math.min(a.length, b.length);

    for (int i = 0; i < length; i++) {
      int temp = a[i];
      a[i] = b[i];
      b[i] = temp;
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("a 요소 수: ");
    int aSize = scanner.nextInt();

    int[] a = new int[aSize];

    for (int i = 0; i < a.length; i++) {
      System.out.print("a:[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    System.out.print("b 요소 수: ");
    int bSize = scanner.nextInt();
    int[] b = new int[bSize];

    for (int i = 0; i < b.length; i++) {
      System.out.print("b:[" + i + "]: ");
      b[i] = scanner.nextInt();
    }

    System.out.print("배열 a와 b의 전체 요소를 교환했습니다.");
    System.out.print("배열 a: ");
    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "]: " + a[i]);
    }

    for (int i = 0; i < b.length; i++) {
      System.out.println("b[" + i + "]: " + b[i]);
    }
  }

}
