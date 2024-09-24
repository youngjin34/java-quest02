import java.util.Scanner;

public class ex27 {
  public static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
    if (x.length != y.length || x[0].length != y[0].length) {
      return false;
    }

    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < x[i].length; j++) {
        z[i][j] = x[i][j] + y[i][j];
      }
    }

    return true;

  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("x행렬의 행의 수: ");
    int xRows = scanner.nextInt();
    System.out.print("x행렬의 열의 수: ");
    int xCols = scanner.nextInt();

    int[][] x = new int[xRows][xCols];
    System.out.println("행렬 x의 값 입력");
    for (int i = 0; i < xRows; i++) {
      for (int j = 0; j < xCols; j++) {
        System.out.print("x[" + i + "][" + j + "]: ");
        x[i][j] = scanner.nextInt();
      }
    }

    System.out.print("y행렬의 행의 수: ");
    int yRows = scanner.nextInt();
    System.out.print("y행렬의 열의 수: ");
    int yCols = scanner.nextInt();

    int[][] y = new int[yRows][yCols];
    System.out.println("행렬 y의 값 입력");
    for (int i = 0; i < yRows; i++) {
      for (int j = 0; j < yCols; j++) {
        System.out.print("y[" + i + "][" + j + "]: ");
        y[i][j] = scanner.nextInt();
      }
    }

    if (xRows == yRows && xCols == yCols) {
      int[][] z = new int[xRows][xCols];

      if (addMatrix(x, y, z)) {
        for (int i = 0; i < z.length; i++) {
          for (int j = 0; j < z[i].length; j++) {
            System.out.print(z[i][j] + " ");
          }
          System.out.println();
        }
      }
    } else {
      System.out.println("행렬의 크기가 일치하지 않습니다.");
    }

  }
}
