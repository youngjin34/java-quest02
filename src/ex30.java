import java.util.Scanner;

public class ex30 {
  public static int min(int a, int b) {
    return (a > b) ? b : a;
  }

  public static int min(int a, int b, int c) {
    return min(min(a, b), c);
  }

  public static int min(int[] a) {
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
      }
    }
    return min;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("x 값: ");
    int x = scanner.nextInt();
    System.out.print("y 값: ");
    int y = scanner.nextInt();
    System.out.print("z 값: ");
    int z = scanner.nextInt();

    System.out.print("배열 a의 요소 수: ");
    int idx = scanner.nextInt();

    int[] a = new int[idx];

    for (int i = 0; i < a.length; i++) {
      System.out.println("a[" + i + "]: ");
      a[i] = scanner.nextInt();
    }

    int minXY = min(x, y);
    int minXYZ = min(x, y, z);
    int minArray = min(a);

    System.out.println("x, y의 최솟값은 " + minXY + " 입니다.");
    System.out.println("x, y, z의 최솟값은 " + minXYZ + " 입니다.");
    System.out.println("배열 a의 최솟값은 " + minArray + " 입니다.");

  }
}
