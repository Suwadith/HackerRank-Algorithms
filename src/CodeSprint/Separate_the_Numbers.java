package CodeSprint;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/18/2017.
 */
public class Separate_the_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            /*for(int x=0; x<s.length()-1; x++){
                for(int y=1; y<=s.length(); y++){
                    System.out.println(s.substring(x,y));
                    int num = Integer.parseInt(s.substring(x,y));
                }
                break;
            }*/
            /*int count1 =0;
            int[] arr = new int[s.length()];
            for(int x=0; x<s.length(); x++){
                int num = Integer.parseInt(s.substring(x,x+1));
                arr[x]=num;

            }
            for(int x=0; x<arr.length-1; x++){

                if(arr[x]==(arr[x+1])-1){
                    count1++;
                }
            }
            if(count1==arr.length-1){
                System.out.println("YES " + s.charAt(0));
            }*/

        }
    }

}
