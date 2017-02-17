package Implementation;

import java.util.*;

/**
 * Created by Suwadith on 2/14/2017.
 */
public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int firstKangaroo = x1;
        int secondKangaroo = x2;
        int success = 0;

        for (int x = 0; x < 1000000; x++) {
            firstKangaroo += v1;
            secondKangaroo += v2;

            if (firstKangaroo == secondKangaroo) {
                System.out.println("YES");
                success++;
                break;
            }
        }

        if (success == 0) {
            System.out.println("NO");
        }

    }

}
