package Java_basic;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter operator ");
        char c = input.next().charAt(0);

        switch (c) {
            case '+':
                int sum=a+b;
                System.out.println("Sum = " + sum);
                break;
            case '-':
                int x = a - b;
                System.out.println("Sub = " + x);
                break;
            case '*':
                int mul = a * b;
                System.out.println("Mul = " + mul);
                break;
            case '/':
                double d = a / b;
                System.out.println("Div = " + d);
                break;
        }

        input.close();
    }
}