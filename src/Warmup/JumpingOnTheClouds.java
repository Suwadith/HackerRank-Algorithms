package Warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        int start = 0;

        if(c.length > 2 && c[2] == 0) {
            start = 1;
        }

        for(int i=start; i<c.length-1; i++) {
            if(i<c.length-2 && c[i+2] == 0) {
                i++;
                jumps++;

            } else if(i<c.length-2 && c[i+2] == 1) {
                jumps++;
            } else if(i<c.length-1 && c[i+1] == 0) {
                jumps++;
            }
        }

        return jumps;

    }



    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] c = new int[n];

        String[] cItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

    }

}
