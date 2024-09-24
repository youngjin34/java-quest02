import java.util.Scanner;

public class ex22 {
  public static int[] arrayClone(int[] a) {
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[i];
    }
    return b;
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

    int[] b = arrayClone(a);

    System.out.println("배열 a를 복사해서 배열 y를 생성했습니다.");
    for (int i = 0; i < b.length; i++) {
      System.out.println("b[" + i + "]: " + b[i]);
    }
  }

}
