package Implementation;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Bon_Appétit {

    static int bonAppetit(int n, int k, int b, int[] ar) {

        int value = 0;

        for(int i=0; i<n; i++){
            if(i!=k) {
                value += ar[i];
            }
        }

        if(value/2!=b){
            value = b-value/2;
            System.out.println(value);
        }else if(value/2 == b){
            System.out.println("Bon Appetit");
        }

        return value;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
    }

}
