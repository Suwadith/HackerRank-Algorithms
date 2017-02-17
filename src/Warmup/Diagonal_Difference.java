package Warmup;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Diagonal_Difference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }

        int primarySum=0;
        int secondarySum=0;

        int finalSum=0;

        for(int x=0; x<n; x++){
                primarySum+=a[x][x];
        }

        int x=0;
        for(int y=n-1; y>=0; y--){
            secondarySum+=a[x][y];
            x++;
        }




        if(primarySum>secondarySum){
            finalSum=primarySum-secondarySum;
        }else if(secondarySum>primarySum){
            finalSum=secondarySum-primarySum;
        }

        System.out.println(finalSum);

    }

}
