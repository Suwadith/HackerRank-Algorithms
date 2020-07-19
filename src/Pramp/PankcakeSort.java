package Pramp;

import java.util.Arrays;
import java.util.Scanner;

public class PankcakeSort {

    public static int[] flip(int[] arr, int k) {

        for(int i=0; i<k/2; i++) {
            int current = arr[i];
            arr[i] = arr[k-1-i];
            arr[k-1-i] = current;
        }

        return arr;
    }

    public static int[] sort(int[] arr, int k) {

        for(int i=0; i<k; i++) {
           for(int x=i+1; x<k; x++) {
               if(arr[i] > arr[x]) {
                   int temp = arr[i];
                   arr[i] = arr[x];
                   arr[x] = temp;
               }
           }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = Integer.parseInt(sc.nextLine());

        String[] inputArr = input.split(", ");
        int[] arr = new int[length];

        for(int i=0; i<length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println(Arrays.toString(flip(arr, length)));

        System.out.println(Arrays.toString(sort(arr, length)));

    }

}
