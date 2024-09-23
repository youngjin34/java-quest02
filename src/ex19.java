import java.util.Scanner;

public class ex19 {
  public static void aryRmv(int[] a, int idx, int n) {
    for (int i = idx; i < a.length - n; i++) {
      a[i] = a[i + n];
    }

    for (int i = a.length - n; i < a.length; i++) {
      a[i] = a[i];
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int num = scanner.nextInt();

    int[] x = new int[num];

    for (int i = 0; i < x.length; i++) {
      System.out.print("x:[" + i + "]");
      x[i] = scanner.nextInt();
    }

    System.out.print("삭제할 시작할 인덱스: ");
    int idx = scanner.nextInt();
    System.out.println("삭제할 요소의 수: ");
    int n = scanner.nextInt();

    aryRmv(x, idx, n);

    for (int i = 0; i < x.length; i++) {
      System.out.println("x[" + i + "]: " + x[i]);
    }

  }

}
