import java.util.Scanner;

public class ex20 {
  public static void aryIns(int[] a, int idx, int x) {
    // 뒤로 하나씩 밀어줌
    for (int i = a.length - 1; i > idx; i--) {
      a[i] = a[i - 1];
    }

    a[idx] = x;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int num = scanner.nextInt();

    int[] a = new int[num];

    for (int i = 0; i < a.length; i++) {
      System.out.print("a:[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    System.out.print("삽입할 요소의 인덱스: ");
    int idx = scanner.nextInt();
    System.out.print("삽입할 값: ");
    int x = scanner.nextInt();

    aryIns(a, idx, x);

    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "]: " + a[i]);
    }

  }

}
