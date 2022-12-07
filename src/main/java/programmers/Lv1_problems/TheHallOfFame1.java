package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//        TheHallOfFame1 theHallOfFame1 = new TheHallOfFame1();
//                int[] k = {3,4};
//                int[][] score = {{10,100,20,150,1,100,200}, {0,300,40,300,20,70,150,50,500,1000}};
//
//                for(int i = 0; i < k.length; i++) {
//        Arrays.stream(theHallOfFame1.solution(k[i], score[i])).forEach(System.out::println);
//        System.out.println();
//        }

public class TheHallOfFame1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if (hallOfFame.size() < k) {
                hallOfFame.add(score[i]);
                hallOfFame.sort(Comparator.naturalOrder());
            }
            else {
                if(score[i] >= hallOfFame.get(0)) {
                    hallOfFame.remove(hallOfFame.get(0));
                    hallOfFame.add(score[i]);
                    hallOfFame.sort(Comparator.naturalOrder());
                }
            }
            answer[i] = hallOfFame.get(0);
        }
        return answer;
    }
}
