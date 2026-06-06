public class AverageCalculator {
    public static void main(String[] args) {
        double[] numbers={10.5,20.0,30.5,40.0,50.0};
        double sum=0;

        for (double num:numbers) {
            sum =num;
        }
        double average=sum/numbers.length;
        System.out.println("Average of elements: " + average);
    }
}