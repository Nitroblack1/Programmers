package programmers.Lv1_problems;

import java.util.Arrays;

//        MinimumRectangle minimumRectangle = new MinimumRectangle();
//
//                int[][][] sizes = {
//                {{60, 50}, {30, 70}, {60, 30}, {80, 40}},
//                {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}},
//                {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}
//                };
//
//                for(int i = 0; i < sizes.length; i++) {
//        System.out.println(minimumRectangle.solution(sizes[i]));
//        }

public class MinimumRectangle {

    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        int maxA = 0; int maxB = 0;
        for (int i = 0; i < sizes.length; i++) {
            maxA = Math.max(maxA, sizes[i][1]);
            if(Math.max(maxA, sizes[i][1]) == sizes[i][1]) {
                maxB = sizes[i][0];
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxB = Math.max(maxB, sizes[i][0]);
        }
        return maxB * maxA;
    }
}
