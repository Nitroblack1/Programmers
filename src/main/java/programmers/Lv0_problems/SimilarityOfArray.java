package programmers.Lv0_problems;

import java.util.Objects;

//String[][] s1 = {{"a", "b", "c"}, {"n", "omg"}};
//        String[][] s2 = {{"com", "b", "d", "p", "c"}, {"m", "dot"}};
//        System.out.println(SimilarityOfArray.solution(s1[0], s2[0]));
//        System.out.println(SimilarityOfArray.solution(s1[1], s2[1]));

public class SimilarityOfArray {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String element1 : s1) {
            for(String element2 : s2) {
                if (Objects.equals(element1, element2)){
                    answer++;
                }
            }
        }
        return answer;
    }
}
