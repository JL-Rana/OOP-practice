package Java_basic;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){

        //Second-Largest Number in an Array

        Scanner input= new Scanner(System.in);

        int n;
        System.out.println("Enter Array size: ");
        n=input.nextInt();

        if(n<2){
            System.out.println("Size must be getter than 1 !");
            return;
        }

        System.out.println("Enter "+ n + " Elements: ");
        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }

        int first=arr[0],second=arr[1];

        for (int i=0; i<n; i++){
            if(arr[i]>first) first=arr[i];
        }

        for (int i=0; i<n; i++){
            if(arr[i]>second && arr[i]<first) second=arr[i];
        }

        System.out.println("Lergest Number of your Array is: "+first +" and \nSecond-Largest Number is: "+second);
        input.close();
        return;


    }
}
