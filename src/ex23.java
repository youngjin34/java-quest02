import java.util.Scanner;

public class ex23 {
  public static int[] arraySrchIdx(int[] a, int searchValue) {
    int count = 0;

    // 일치하는 요소 수 세기
    for (int i = 0; i < a.length; i++) {
      if (a[i] == searchValue) {
        count++;
      }
    }

    int[] idx = new int[count];
    int index = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] == searchValue) {
        idx[index++] = i;
      }
    }

    return idx;
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

    System.out.print("탐색할 값: ");
    int searchValue = scanner.nextInt();

    int[] result = arraySrchIdx(array, searchValue);

    System.out.println("일치하는 요소의 인덱스");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
