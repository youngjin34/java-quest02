import java.util.Scanner;

public class ex25 {
  public static int[] arrayRmvOfN(int[] a, int idx, int n) {

    int[] newArray = new int[a.length - n];

    for (int i = 0; i < idx; i++) {
      newArray[i] = a[i];
    }

    for (int i = idx; i < newArray.length; i++) {
      newArray[i] = a[i + n];
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

    System.out.println("삭제할 요소의 개수: ");
    int n = scanner.nextInt();

    int[] result = arrayRmvOfN(array, idx, n);

    for (int i = 0; i < result.length; i++) {
      System.out.println("y[" + i + "]: " + result[i]);
    }

  }
}
