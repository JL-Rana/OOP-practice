public class EvenSeries {
    public static void main(String[] args) {

        System.out.println("Using for-loop:");
        int sumFor = 0;
        for (int i=2;i<=20;i+=2) {
            System.out.print(i+" ");
            sumFor+=i;
        }
        System.out.println("\nSum using for-loop: " +sumFor);

        System.out.println();
        System.out.println("Using while loop:");
        int sumWhile=0;
        int j=2;
        while (j<=20){
            System.out.print(j+" ");
            sumWhile+=j;
            j+=2;
        }
        System.out.println("\nSum using while loop: "+sumWhile);
        System.out.println();

        System.out.println("Using do-while loop:");
        int sumDoWhile=0;
        int k=2;
        do {
            System.out.print(k+" ");
            sumDoWhile+=k;
            k+=2;
        } while (k<=20);
        System.out.println("\nSum using do-while loop: "+sumDoWhile);
    }
}