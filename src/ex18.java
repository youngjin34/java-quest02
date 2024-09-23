import java.util.Scanner;

public class ex18 {
  public static void arrRmv(int[] a, int idx) {
    for (int i = idx; i < a.length - 1; i++) {
      a[i] = a[i + 1];
    }
    a[a.length - 1] = a[a.length - 1];
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

    System.out.print("삭제할 요소의 인덱스: ");
    int idx = scanner.nextInt();

    arrRmv(x, idx);

    for (int i = 0; i < x.length; i++) {
      System.out.println("x[" + i + "]: " + x[i]);
    }

  }

}
