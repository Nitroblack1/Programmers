package programmers;

import java.util.Arrays;
import programmers.Lv0_problems.AdditionOfFraction;

public class Main {

    public static void main(String[] args) {
        AdditionOfFraction additionOfFraction = new AdditionOfFraction();

        int[] denum1 = {1,9,1};
        int[] num1 = {2,2,2};
        int[] denum2 = {3,1,1};
        int[] num2 = {4,3,2};

        for(int i = 0; i < denum1.length; i++) {
            Arrays.stream(additionOfFraction.solution(denum1[i], num1[i], denum2[i], num2[i])).forEach(System.out::print);
            System.out.println();
        }
    }
}


