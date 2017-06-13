package Implementation;

import java.util.Scanner;

/**
 * Created by suwad on 6/9/2017.
 */
public class Breaking_the_Records {

    static int[] getRecord(int[] s){

        int[] output = new int[2];

        int high = s[0];
        int highCount = 0;
        int low = s[0];
        int lowCount = 0;

        for(int i=0; i<s.length; i++){
            if(s[i]>high){
                high = s[i];
                highCount++;
            }
        }

        output[0]=highCount;

        for(int i=0; i<s.length; i++){
            if(s[i]<low){
                low = s[i];
                lowCount++;
            }
        }

        output[1]=lowCount;

        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
