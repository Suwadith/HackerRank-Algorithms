package CodeSprint;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Breaking_the_Records {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }

        int numHighest = 0;
        int numLowest = 0;

        int highest = score[0];
        for(int x=0; x<n; x++){
            if(score[x]>highest){
                highest = score[x];
                numHighest++;
            }
        }

        int lowest = score[0];
        for(int x=0; x<n; x++){
            if(score[x]<lowest){
                lowest=score[x];
                numLowest++;
            }
        }

        System.out.println(numHighest+" "+numLowest);


    }


}
