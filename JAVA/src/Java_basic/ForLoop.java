package Java_basic;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        //Sum of n Numbers

        Scanner input= new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=input.nextInt();
        System.out.println("Enter "+n+" numbers: ");
        int sum=0;


        for(int i=0; i<n; i++){
            int x=input.nextInt();
            sum+=x;
        }

        System.out.println("Sum = "+sum);

        input.close();
    }
}
