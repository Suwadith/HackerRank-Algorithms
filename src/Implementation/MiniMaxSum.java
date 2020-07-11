package Implementation;

import java.util.*;

/**
 * Created by Suwadith on 2/12/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        ArrayList<Long> sortedList = new ArrayList<>();

        sortedList.add(a);
        sortedList.add(b);
        sortedList.add(c);
        sortedList.add(d);
        sortedList.add(e);

        Collections.sort(sortedList);

        long highest=0;
        long lowest=0;

        for(int x=1; x<5; x++){
            highest+=sortedList.get(x);
        }

        for(int x=0; x<4; x++){
            lowest+=sortedList.get(x);
        }

        System.out.println(lowest + " " + highest);

    }

}
