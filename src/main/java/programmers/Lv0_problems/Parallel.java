package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.List;

//        Parallel parallel = new Parallel();
//
//                int[][] case1 = {{1,4}, {9,2}, {3,8}, {11,6}};
//                int[][] case2 = {{3,5}, {4,1}, {2,4}, {5,10}};
//                int[][] case3 = {{1,1}, {2,2}, {1,1}, {2,2}};
//
//                System.out.println(parallel.solution(case1));
//                System.out.println(parallel.solution(case2));
//                System.out.println(parallel.solution(case3));

public class Parallel {
    public int solution(int[][] dots) {
        List<Double> slope = new ArrayList<>();
        for(int i = 0; i < dots.length - 1; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                slope.add((double)(dots[i][1] - dots[j][1]) / (double)(dots[i][0] - dots[j][0]));
            }
        }
        if (slope.stream().distinct().count() < slope.size()) {
            return 1;
        }
        return 0;
    }
}
