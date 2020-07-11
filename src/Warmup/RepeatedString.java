package Warmup;

import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }

        long completeSets = (n/s.length());
        int remainingSubstringLength = (int) (n%s.length());

        long finalCount = 0;
        finalCount = count*completeSets;

        if(remainingSubstringLength>0) {

            for(int i=0; i<remainingSubstringLength; i++) {
                if(s.charAt(i) == 'a') {
                    finalCount++;
                }
            }

        }

        return finalCount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println((String.valueOf(result)));
        System.out.println();

    }

}
