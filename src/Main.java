import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число, факториал которого вудем вычислять:");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= value; i++){
            factorial = factorial * i;
        }

        System.out.println(value + "! = " + factorial + ";");
		System.out.println("END");
    }
}