package Warmup;

import java.util.Scanner;

/**
 * Created by suwad on 6/9/2017.
 */
public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {

        int count = 0;
        int highest = 0;

        for(int i=0; i<n-1; i++){
            if(ar[i]>=highest){
                highest = ar[i];
            }
        }

        for(int i=0; i<n; i++){
           if(ar[i]==highest){
               count++;
           }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
