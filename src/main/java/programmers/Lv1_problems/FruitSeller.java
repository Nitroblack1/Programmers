package programmers.Lv1_problems;

import java.util.Arrays;

//        FruitSeller fruitSeller = new FruitSeller();
//                int[] k = {3,4};
//                int[] m = {4,3};
//                int[][] score = {{1, 2, 3, 1, 2, 3, 1}, {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}};
//
//                for(int i = 0; i < k.length; i++) {
//        System.out.println(fruitSeller.solution(k[i], m[i], score[i]));
//        }

public class FruitSeller {
    public int solution(int k, int m, int[] score) { // 1,1,1,2,2,3,3 / m = 4
        int answer = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length/m; i++) {
            answer += score[score.length - i*m - m]*m;
        }
        return answer;
    }
}
