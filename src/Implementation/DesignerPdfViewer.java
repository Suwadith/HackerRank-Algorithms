package Implementation;

import java.util.*;

/**
 * Created by Suwadith on 2/12/2017.
 */
public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }

        String word = in.next();

        int wordLength = word.length();

        char[] splitWord = new char[wordLength];

        for (int x = 0; x < splitWord.length; x++) {
            splitWord[x] = word.charAt(x);
        }

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        HashMap<Object, Integer> values = new HashMap();

        for (int x = 0; x < 26; x++) {
            values.put(alphabet[x], h[x]);
        }

        int biggest = 0;

        for (int x = 0; x < wordLength; x++) {
            for (int y = 0; y < 26; y++) {
                if (splitWord[x] == alphabet[y]) {
                    int t = values.get(alphabet[y]);
                    if(biggest <= t){
                        biggest = t;
                    }

                }

            }
        }

        System.out.println(biggest*wordLength);



    }

}
