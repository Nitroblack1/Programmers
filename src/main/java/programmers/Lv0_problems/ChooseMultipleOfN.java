package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.List;

//int[] n = {3, 5, 12};
//        int[][] numList = {{4, 5, 6, 7, 8, 9, 10, 11, 12}, {1, 9, 3, 10, 13, 5},
//        {2, 100, 120, 600, 12, 12}};
//        for (int i = 0; i < 3; i++) {
//        Arrays.stream(ChooseMultipleOfN.solution(n[i], numList[i]))
//        .forEach(System.out::println);
//        }

public class ChooseMultipleOfN {
    public static int[] solution(int n, int[] numList) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < numList.length; i++) {
            if (numList[i] % n == 0) {
                answerList.add(numList[i]);
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}
