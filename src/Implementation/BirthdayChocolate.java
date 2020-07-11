package Implementation;

import java.util.Scanner;

/**
 * Created by suwad on 6/9/2017.
 */
public class BirthdayChocolate {

    static int solve(int n, int[] s, int d, int m){

        int count = 0;
        int total = 0;

        for(int i=0; i<n-m+1; i++){
            for(int a=i; a<i+m; a++){
                total+=s[a];
            }
            if(total == d){
                count++;
            }
            total =0;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
