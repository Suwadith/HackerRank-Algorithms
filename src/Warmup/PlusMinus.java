package Warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int countPositive=0;
        int countNegative=0;
        int countNeutral=0;

        for(int x=0; x<n; x++){
            if(arr[x]>0){
                countPositive++;
            }else if(arr[x]<0){
                countNegative++;
            }else{
                countNeutral++;
            }
        }

        double d =n;

        double positive=countPositive/d;
        double negative=countNegative/d;
        double neutral=countNeutral/d;

        DecimalFormat df = new DecimalFormat("#.####");




        System.out.println(df.format(positive));
        System.out.println(df.format(negative));
        System.out.println(df.format(neutral));
    }

}
