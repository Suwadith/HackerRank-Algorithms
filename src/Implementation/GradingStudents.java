import java.util.Scanner;

/**
 * Created by Suwadith on 5/2/2017.
 */
public class GradingStudents {

    static int x = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }


        for(int i=0; i<grades.length; i++){
            x=grades[i];
            if(x>37){
                if(x%5>2){
                    grades[i]=grades[i]-x%5+5;
                }
            }
            System.out.println(grades[i]);
        }


    }

}
