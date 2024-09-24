import java.util.Scanner;

public class ex29 {
  public static int[][] arrayClone(int[][] x) {
    int[][] clone = new int[x.length][x[0].length];

    for (int i = 0; i < clone.length; i++) {
      for (int j = 0; j < clone[0].length; j++) {
        clone[i][j] = x[i][j];
      }
    }

    return clone;
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

    int[][] clone = arrayClone(x);

    System.out.println("행렬 a의 복사본");
    for (int i = 0; i < clone.length; i++) {
      for (int j = 0; j < clone[i].length; j++) {
        System.out.print(clone[i][j] + " ");
      }
      System.out.println();
    }

  }
}
