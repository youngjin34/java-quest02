import java.util.Scanner;

public class ex24 {
  public static int[] arrayRmvOf(int[] a, int idx) {

    int[] newArray = new int[a.length - 1];

    for (int i = 0; i < idx; i++) {
      newArray[i] = a[i];
    }

    for (int i = idx; i < a.length - 1; i++) {
      newArray[i] = a[i + 1];
    }

    return newArray;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("a 요소 수: ");
    int a = scanner.nextInt();

    int[] array = new int[a];

    for (int i = 0; i < array.length; i++) {
      System.out.print("array:[" + i + "]: ");
      array[i] = scanner.nextInt();
    }

    System.out.print("삭제할 요소의 인덱스: ");
    int idx = scanner.nextInt();

    int[] result = arrayRmvOf(array, idx);

    for (int i = 0; i < result.length; i++) {
      System.out.println("y[" + i + "]: " + result[i]);
    }

  }
}
