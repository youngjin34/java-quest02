import java.util.Scanner;

public class ex28 {
  public static int[][] addMatrix(int[][] x, int[][] y) {
    int[][] z = new int[x.length][x[0].length];

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        z[i][j] = x[i][j] + y[i][j];
      }
    }

    return z;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("행렬의 행의 수: ");
    int rows = scanner.nextInt();
    System.out.print("행렬의 열의 수: ");
    int cols = scanner.nextInt();

    int[][] x = new int[rows][cols];
    System.out.println("행렬 x의 값 입력");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("x[" + i + "][" + j + "]: ");
        x[i][j] = scanner.nextInt();
      }
    }

    int[][] y = new int[rows][cols];
    System.out.println("행렬 y의 값 입력");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print("y[" + i + "][" + j + "]: ");
        y[i][j] = scanner.nextInt();
      }
    }

    int[][] z = addMatrix(x, y);

    System.out.println("행렬 c");
    for (int i = 0; i < z.length; i++) {
      for (int j = 0; j < z[i].length; j++) {
        System.out.print(z[i][j] + " ");
      }
      System.out.println();
    }

  }
}
