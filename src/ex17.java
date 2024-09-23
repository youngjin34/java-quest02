import java.util.Scanner;

public class ex17 {
  public static int linearSearch(int[] a, int key) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int linearSearchR(int[] a, int key) {
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("요소 수: ");
    int num = scanner.nextInt();

    int[] x = new int[num];

    for (int i = 0; i < x.length; i++) {
      System.out.print("x:[" + i + "]");
      x[i] = scanner.nextInt();
    }

    System.out.print("찾는 값: ");
    int key = scanner.nextInt();

    int firstIndex = linearSearch(x, key);
    int lastIndex = linearSearchR(x, key);

    if (firstIndex == -1) {
      System.out.println("배열에 값이 존재하지 않습니다.");
    } else {
      System.out.println("rkwkd dkvdp dnlclgks rkqtdms x[" + firstIndex + "]에 있습니다.");
      System.out.println("rkwkd dkvdp dnlclgks rkqtdms x[" + lastIndex + "]에 있습니다.");
    }

  }

}
