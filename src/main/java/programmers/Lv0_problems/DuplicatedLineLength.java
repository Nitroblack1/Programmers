package programmers.Lv0_problems;

import java.util.HashMap;
import java.util.Map;

//        DuplicatedLineLength duplicatedLineLength = new DuplicatedLineLength();
//
//                int[][] case1 = {{0,1}, {2,5}, {3,9}};
//                int[][] case2 = {{-1,1}, {1,3}, {3,9}};
//                int[][] case3 = {{0,5}, {3,9}, {1,10}};
//                int[][] case4 = {{-2,0}, {0,8}, {-2,6}};
//
//                System.out.println(duplicatedLineLength.solution(case1));
//                System.out.println(duplicatedLineLength.solution(case2));
//                System.out.println(duplicatedLineLength.solution(case3));
//                System.out.println(duplicatedLineLength.solution(case4));

public class DuplicatedLineLength {
    public int solution(int[][] lines) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int[] line : lines) {
            int tempMin = Math.min(line[0], line[1]);
            int tempMax = Math.max(line[0], line[1]);
            for (int i = tempMin + 1; i < tempMax + 1; i++) {
                String str = (i - 1) + "/" + i;
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (Integer value : map.values()) {
            if (value > 1) {
                answer++;
            }
        }

        return answer;
    }
}