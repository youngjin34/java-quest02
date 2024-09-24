import java.util.Scanner;

public class ex32 {

  public static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%d ", a[i]);
    }
    System.out.println();
  }

  public static void printArray(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.printf("%-8d", a[i][j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("1차원 배열의 요소 수: ");
    int oneDSize = scanner.nextInt();
    int[] x = new int[oneDSize];

    for (int i = 0; i < oneDSize; i++) {
      System.out.print("x[" + i + "]: ");
      x[i] = scanner.nextInt();
    }

    System.out.print("2차원 배열의 행 수: ");
    int twoDSize = scanner.nextInt();
    int[][] y = new int[twoDSize][];

    for (int i = 0; i < twoDSize; i++) {
      System.out.print("행 " + i + "의 열 수: ");
      int columnSize = scanner.nextInt();
      y[i] = new int[columnSize];

      for (int j = 0; j < columnSize; j++) {
        System.out.print("y[" + i + "][" + j + "]: ");
        y[i][j] = scanner.nextInt();
      }
    }

    System.out.println();
    System.out.println("1차원 배열의 표시 예:");
    printArray(x);

    System.out.println("2차원 배열의 표시 예:");
    printArray(y);

  }
}
