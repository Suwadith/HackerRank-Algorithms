package Implementation;

import java.util.*;

/**
 * Created by Suwadith on 2/14/2017.
 */
public class AppleAndOrange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();

        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }

        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }

        int[] appleDistance = new int[m];
        int[] orangeDistance = new int[n];

        for(int x=0; x<m; x++){
            appleDistance[x]=a+apple[x];
        }

        for(int x=0; x<n; x++){
            orangeDistance[x]=b+orange[x];
        }

        int applesBetween=0;

        for(int x=0; x<appleDistance.length; x++){
            if(appleDistance[x]>=s && appleDistance[x]<=t){
                applesBetween++;
            }
        }

        int orangesBetween=0;

        for(int x=0; x<orangeDistance.length; x++){
            if(orangeDistance[x]>=s && orangeDistance[x]<=t){
                orangesBetween++;
            }
        }

        System.out.println(applesBetween);
        System.out.println(orangesBetween);

       /* for(int x=0; x<orangeDistane.length; x++){
            System.out.println(appleDistance[x]);
            System.out.println(orangeDistane[x]);
        }*/



    }

}
