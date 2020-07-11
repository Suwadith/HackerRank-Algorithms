package Implementation;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/16/2017.
 */
public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int a[] = new int[n];

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int total = 0;
        int count = 0;

        for (int x = 0; x < n; x++) {
            for (int i = x + 1; i < n; i++) {
                total = a[x] + a[i];
                if(total%k==0){
                    count++;
                }
            }
        }

        System.out.println(count);


    }

}
