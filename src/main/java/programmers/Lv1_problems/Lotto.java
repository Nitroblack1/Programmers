package programmers.Lv1_problems;

import java.util.Arrays;

//        Lotto lotto = new Lotto();
//
//                int[][] lottoses = {{44, 1, 0, 0, 31, 25}, {0, 0, 0, 0, 0, 0}, {45, 4, 35, 20, 3, 9}};
//                int[][] win_nums = {{31, 10, 45, 1, 6, 19}, {38, 19, 20, 40, 15, 25}, {20, 9, 3, 45, 4, 35}};
//
//                for(int i = 0; i < lottoses.length; i++) {
//        Arrays.stream(lotto.solution(lottoses[i], win_nums[i])).forEach(System.out::print);
//        System.out.println();
//        }

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int possible = 0;
        int[] answer = new int[2];
        for(int number : lottos) {
            if(Arrays.stream(win_nums).filter(e->e==number).findFirst().isPresent()) {
                correct++;
            }
            if(number == 0) {
                possible++;
            }
        }
        if (correct < 2) {
            if (correct + possible < 2) {
                answer[0] = 6;
            }
            else {
                answer[0] = 7 - correct - possible;
            }
            answer[1] = 6;
            return answer;
        }
        return new int[]{7 - correct - possible, 7 - correct};
    }
}
