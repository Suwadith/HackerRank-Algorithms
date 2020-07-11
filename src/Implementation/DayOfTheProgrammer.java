package Implementation;

import java.util.Scanner;

/**
 * Created by suwad on 6/13/2017.
 */
public class DayOfTheProgrammer {

    static String solve(int year){

        String finalDate = "";

        if(year<=1917) {
            if (year % 4 == 0) {
                finalDate = "12.09." + year;
            } else {
                finalDate = "13.09." + year;
            }
        }else if(year == 1918){
            finalDate = "26.09." + year;
        }else{
            if(year%400 == 0){
                finalDate = "12.09."+year;
            }else if(year%4==0&&year%100!=0){
                finalDate = "12.09."+year;
            }else{
                finalDate = "13.09."+year;
            }

        }

        return finalDate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
