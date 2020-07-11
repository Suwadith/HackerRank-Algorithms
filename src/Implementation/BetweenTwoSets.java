package Implementation;

import java.util.*;

/**
 * Created by Suwadith on 2/14/2017.
 */
public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }

        ArrayList<Integer> test = new ArrayList<>();

        for(int x=0; x<n; x++){
            test.add(a[x]);
        }

        Collections.sort(test);

        int count=0;
        int finalcount=0;

        for(int x=0; x<n; x++){
            for(int y=test.get(n-1); y<=b[0]; y++) {
                if (y%test.get(x)==0){
                    count=0;
                    for(int z=0; z<m; z++){
                        if(b[z]%y==0){
                            count++;
                            if(count==m){
                                System.out.println(y);
                                finalcount++;
                                count=0;
                            }
                        }

                    }
                }
            }
            break;
        }

        System.out.println(finalcount);



    }

}
