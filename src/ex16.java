import java.util.Scanner;

public class ex16 {
  public static void main(String[] args) throws Exception {

    int[][] human = inputHeightWeight();
    int[] minValues = minOf(human);

    System.out.println("최소 신장: " + minValues[0]);
    System.out.println("최소 몸무게: " + minValues[1]);
  }

  public static int[][] inputHeightWeight() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("사람 수: ");
    int people = scanner.nextInt();
    System.out.println(people + "명의 신장과 몸무게를 입력하자");

    int[][] human = new int[people][2];

    for (int i = 0; i < human.length; i++) {
      System.out.print((i + 1) + "번의 신장: ");
      human[i][0] = scanner.nextInt();
      System.out.print((i + 1) + "번의 몸무게: ");
      human[i][1] = scanner.nextInt();
    }

    return human;
  }

  public static int[] minOf(int[][] a) {
    int heightMin = Integer.MAX_VALUE;
    int weightMin = Integer.MAX_VALUE;

    for (int i = 0; i < a.length; i++) {
      int height = a[i][0];
      int weight = a[i][1];

      if (height < heightMin) {
        heightMin = height;
      }

      if (weight < weightMin) {
        weightMin = weight;
      }
    }

    return new int[] { heightMin, weightMin };
  }
}
