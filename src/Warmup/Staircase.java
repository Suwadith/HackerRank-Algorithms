package Warmup;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int x = n ; x > 0 ; x--) {
            for(int i=0; i<x-1; i++){
                System.out.print(" ");
            }
            for(int j=0; j<n-x+1; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }


}
