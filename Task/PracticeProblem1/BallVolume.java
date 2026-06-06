package PracticeProblem1;
import java.util.Scanner;

public class BallVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the radius of the ball: ");
        double radius =input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Volume of the ball: " + volume);
        input.close();
    }
}