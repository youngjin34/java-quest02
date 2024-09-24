import java.util.Scanner;

public class ex31 {
  public static int absolute(int x) {
    return (x < 0) ? -x : x;
  }

  public static long absolute(long x) {
    return (x < 0) ? -x : x;
  }

  public static float absolute(float x) {
    return (x < 0) ? -x : x;
  }

  public static double absolute(double x) {
    return (x < 0) ? -x : x;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("int형 변수 x 입력: ");
    int a = scanner.nextInt();
    System.out.print("long형 변수 x 입력: ");
    long b = scanner.nextLong();
    System.out.print("float형 변수 x 입력: ");
    float c = scanner.nextFloat();
    System.out.print("double형 변수 x 입력: ");
    double d = scanner.nextDouble();

    System.out.println("int형 변수 " + a + "의 절댓값은 " + absolute(a) + "입니다.");
    System.out.println("long형 변수 " + b + "의 절댓값은 " + absolute(b) + "입니다.");
    System.out.println("float형 변수 " + c + "의 절댓값은 " + absolute(c) + "입니다.");
    System.out.println("double형 변수 " + d + "의 절댓값은 " + absolute(d) + "입니다.");
  }
}
