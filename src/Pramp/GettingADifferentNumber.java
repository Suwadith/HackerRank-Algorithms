package Pramp;

import java.util.HashMap;
import java.util.Scanner;

public class GettingADifferentNumber {


    public static int returnDifferent(int[] arr) {

        int smallest = 0;
        int MAX_INT = (int) (Math.pow(2, 31) - 1);
        HashMap<Integer, Boolean> numberHash = new HashMap();

        for(int i=0; i<arr.length; i++) {
            numberHash.put(arr[i], true);
        }

        while(smallest < MAX_INT) {
            if(!numberHash.containsKey(smallest)) {
                break;
            }

            smallest++;
        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] inputArr = input.split(", ");
        int[] arr = new int[inputArr.length];

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(inputArr[i]);
        }

        System.out.println(returnDifferent(arr));

    }

}
