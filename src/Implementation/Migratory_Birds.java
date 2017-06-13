package Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by suwad on 6/12/2017.
 */
public class Migratory_Birds {

    static int migratoryBirds(int n, int[] ar) {

        int finalCount = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for(int i=0; i<n; i++){

            switch(ar[i]){
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
            }
        }

        int[] countArray = {count1, count2, count3, count4, count5};

       /* Arrays.sort(countArray);

        finalCOunt = countArray[4];*/

        int largest = countArray[0];

       for(int i=1; i<5; i++){

           if(largest<countArray[i]){
               largest=countArray[i];
               finalCount = i+1;
           }
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
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }

}
