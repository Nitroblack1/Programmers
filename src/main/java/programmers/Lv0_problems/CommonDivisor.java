package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.List;

//int n1 = 24;
//        int n2 = 29;
//        Arrays.stream(CommonDivisor.solution(n1)).forEach(System.out::println);
//        Arrays.stream(CommonDivisor.solution(n2)).forEach(System.out::println);
public class CommonDivisor {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if((n % i) == 0) {
                answerList.add(i);
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}
