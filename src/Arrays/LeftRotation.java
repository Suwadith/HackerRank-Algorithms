package Arrays;

import java.util.Scanner;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        for(int i=0; i<d; i++) {
            int first = a[0];
            for(int x=0; x<a.length-1; x++) {
                a[x] = a[x+1];
            }
            a[a.length-1] = first;
        }

        return a;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

            if (i != result.length - 1) {
                System.out.println(" ");
            }
        }

        System.out.println();

    }

}
