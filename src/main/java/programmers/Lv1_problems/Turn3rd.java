package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.List;

//        Turn3rd turn3rd = new Turn3rd();
//
//                int[] ns = {45,125,3};
//
//                for(int n : ns) {
//                System.out.println(turn3rd.solution(n));
//                }

public class Turn3rd {
    public int solution(int n) {
        int answer = 0;
        List<Integer> sheet = new ArrayList<>();
        while(n >= 3) {
            sheet.add(n%3);
            n /= 3;
        }
        sheet.add(n);
        int j = 0;
        for(int i = sheet.size() - 1; i >= 0; i--) {
            answer += sheet.get(i)*Math.pow(3,j++);
        }
        return answer;
    }
}
