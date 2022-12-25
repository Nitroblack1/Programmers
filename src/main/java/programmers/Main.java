package programmers;

import java.util.Arrays;
import programmers.Lv1_problems.solving.FailureRate;

public class Main {

    public static void main(String[] args) {
        FailureRate failureRate = new FailureRate();

        int[] N = {5, 4};
        int[][] stages = {{2,1,2,6,2,4,3,3}, {4,4,4,4,4}};

        for(int i = 0; i < N.length; i++) {
            Arrays.stream(failureRate.solution(N[i], stages[i])).forEach(System.out::print);
            System.out.println();
        }
    }
}