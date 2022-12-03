package programmers.Lv0_problems;

import java.util.Arrays;

//        CursedNumber3 cursedNumber3 = new CursedNumber3();
//                int n[] = {15,40};
//
//                for (int i = 0; i < n.length; i++) {
//        System.out.println(cursedNumber3.solution(n[i]));
//        }

// String.valueOf(answer).contains("3")만 해도 충분하다.

public class CursedNumber3 {

    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer++;
            while (Arrays.asList(String.valueOf(answer).split("")).contains("3") || answer % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
