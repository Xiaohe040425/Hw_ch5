import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數字：");
        int num1 = scanner.nextInt();

        System.out.println("請輸入第二個數字：");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("兩數的和是：" + sum);

        scanner.close();
    }
}
