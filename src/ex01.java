import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 x: ");
        int x = scanner.nextInt();

        signOf(x);
    }

    public static void signOf(int x) {
        if (x > 0) {
            System.out.println("signOf(x)는 1입니다.");
        } else if (x < 0) {
            System.out.println("signOf(x)는 -1입니다.");
        } else {
            System.out.println("signOf(x)는 0입니다.");
        }
    }
}
