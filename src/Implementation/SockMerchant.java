package Implementation;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> diffColors = new HashSet<>();

        for(int i=0; i<n; i++){
            diffColors.add(ar[i]);
        }

        int count = 0;
        int finalCount = 0;
        for(int i : diffColors){
           count = 0;
            for(int x=0; x<n; x++) {
                if (i == ar[x]){
                    count++;
                }
            }
            finalCount += count/2;
//            System.out.println(count/2);
        }

        return finalCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
