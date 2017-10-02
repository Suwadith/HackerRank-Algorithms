package Implementation;

import java.util.Scanner;

public class Drawing_Book {

    static int solve(int n, int p){

        int count =0;

        if(n-p>n/2){
            for(int i=1; i<p; ){
                count++;
                i+=2;
            }
        }else if(n-p<=n/2){
            if(n-p==1 && n%2==0 && n>2){
                count = 1;
            }else {
                for (int i = n - 1; i > p; ) {
                    count++;
                    i -= 2;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }

}
