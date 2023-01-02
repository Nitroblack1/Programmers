package programmers.Lv1_problems.solving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        double[][] failureRate = new double[N][2];
        int[] answer = new int[5];
        int usersNum = stages.length;
        int unclearedUsersNum;

        for(int i = 1; i <= N; i++) {
            unclearedUsersNum = 0;
            for(int stage : stages) {
                if (stage == i) {
                    unclearedUsersNum++;
                }
            }
            failureRate[i-1][0] = (double) unclearedUsersNum / usersNum;
            failureRate[i-1][1] = i;
            usersNum -= unclearedUsersNum;
        }
        System.out.println(Arrays.deepToString(failureRate));
        Arrays.sort(failureRate, Comparator.comparingDouble((double[] o) -> o[0]).reversed());
        for(int i = 0; i < failureRate.length - 1; i++) {
            if (failureRate[i][1] == failureRate[i+1][1]) {
                
            }
        }
        System.out.println(Arrays.deepToString(failureRate));
        return new int[0];
    }
}
