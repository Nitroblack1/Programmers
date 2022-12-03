package programmers.Lv0_problems;

import java.util.Arrays;

//        ConditionForTriangle conditionForTriangle = new ConditionForTriangle();
//
//                int[][] sides = {{1,2}, {3,6}, {11,7}, {14,14}};
//                for (int i = 0; i < sides.length; i++) {
//        System.out.println(conditionForTriangle.solution(sides[i]));
//        }

public class ConditionForTriangle {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide = Arrays.stream(sides).max().orElse(sides[0]);
        int otherSide = Arrays.stream(sides).min().orElse(sides[0]);
        for (int i = longSide - otherSide + 1; i <= longSide; i++) {
            answer++;
        }
        for (int j = longSide + 1; j < longSide + otherSide; j++) {
            answer++;
        }
        return answer;
    }
}
