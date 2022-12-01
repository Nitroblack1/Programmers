package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//        Rank rank = new Rank();
//
//                int[][] case1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//                int[][] case2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
//
//                Arrays.stream(rank.solution(case1)).forEach(System.out::println);
//                Arrays.stream(rank.solution(case2)).forEach(System.out::println);
public class Rank {

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        for(int[] info : score) {
            rank.add(info[0] + info[1]);
        }
        rank.sort(Comparator.reverseOrder());
        for(int i = 0; i < score.length; i++) {
            answer[i] = rank.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}
