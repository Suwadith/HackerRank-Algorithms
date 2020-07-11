package Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = 0;

        int currentPosition = 0;

        for(int i=0; i<n; i++) {
            switch(s.charAt(i)) {
                case 'D':
                    currentPosition--;
                    break;
                case 'U':
                    currentPosition++;
                    break;
            }

            if(currentPosition == 0 && s.charAt(i) == 'U') {
                result++;
            }
        }

        System.out.println(result);

    }

}
