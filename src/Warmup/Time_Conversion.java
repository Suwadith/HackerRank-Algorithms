package Warmup;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Time_Conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String temp = time.substring(8, 10);
        int hour = Integer.parseInt(time.substring(0, 2));

        if (temp.equals("PM")&&!(time.substring(0,2).equals("12"))) {
            System.out.println(hour + 12 + "" + time.substring(2, 8));
        } else if(time.substring(0,2).equals("12")&&temp.equals("AM")) {
            System.out.println("00"+time.substring(2,8));
        } else{
            System.out.println(time.substring(0, 8));
        }

    }
}
