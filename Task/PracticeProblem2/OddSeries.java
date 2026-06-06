
public class OddSeries {
    public static void main(String[] args) {

        System.out.println("Using for-loop:");
        int sumFor=0;
        for (int i=1;i<=19;i+=2) {
            System.out.print(i+" ");
            sumFor+=i;
        }
        System.out.println("\nSum using for-loop: " +sumFor);
        System.out.println();
        System.out.println("Using while loop:");

        int sumWhile=0;
        int j=1;
        while (j<=19) {
            System.out.print(j+" ");
            sumWhile+=j;
            j+=2;
        }
        System.out.println("\nSum using while loop: " +sumWhile);
        System.out.println();
        System.out.println("Using do-while loop:");

        int sumDoWhile=0;
        int k=1;
        do {
            System.out.print(k+" ");
            sumDoWhile+=k;
            k+=2;
        } while (k<=19);
        System.out.println("\nSum using do-while loop: " + sumDoWhile);
    }
}