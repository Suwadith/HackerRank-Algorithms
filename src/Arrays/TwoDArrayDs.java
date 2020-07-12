package Arrays;

import java.util.Scanner;

public class TwoDArrayDs {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int largest = -54;

        for(int i=0; i<4; i++) {
            for(int x=0; x<4; x++) {
                int sum = arr[i][x] + arr[i][x+1] + arr[i][x+2] + arr[i+1][x+1] + arr[i+2][x] + arr[i+2][x+1] + arr[i+2][x+2];
                if(sum>largest)
                    largest = sum;
            }
        }

        return largest;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
        System.out.println();

    }

}
