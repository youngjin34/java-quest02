import java.util.Scanner;

public class ex15 {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("요소 수: ");
    int num = scanner.nextInt();

    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = scanner.nextInt();
    }

    int result = sumOf(x);
    System.out.println(result);

  }

  public static int sumOf(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    return sum;
  }
}
