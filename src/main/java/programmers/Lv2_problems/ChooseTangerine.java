package programmers.Lv2_problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//        ChooseTangerine chooseTangerine = new ChooseTangerine();
//
//                int[] k = {6,4,2};
//                int[][] tangerine = {{1, 3, 2, 5, 4, 5, 2, 3}, {1, 3, 2, 5, 4, 5, 2, 3}, {1, 1, 1, 1, 2, 2, 2, 3}};
//
//                for(int i = 0; i < k.length; i++) {
//        System.out.println(chooseTangerine.solution(k[i], tangerine[i]));
//        }

public class ChooseTangerine {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> workSheet = new HashMap<>();
        for(int number : tangerine) {
            if(!workSheet.containsKey(number)) {
                workSheet.put(number, 1);
                continue;
            }
            workSheet.replace(number, workSheet.get(number) + 1);
        }
        List<Integer> num = new ArrayList<>(workSheet.values());
        num.sort(Comparator.reverseOrder());
        int temp = 0;
        int answer = 0;
        for(int i = 0; i < num.size(); i++) {
            if (temp < k) {
                temp += num.get(i);
                answer++;
            } else {
                return answer;
            }
        }
        return answer;
    }
}

// tangerine 을 정렬
// distinct()하여 나온 원소들을 돌며 각 원소의 개수를 파악
// 각 원소별 개수를 정렬하여 k가 넘는 순간까지 더한 후, 해당 index를 반환한다.

// 1, 3, 2, 5, 4, 5, 2, 3
// 1, 2, 2, 3, 3, 4, 5, 5
// 1 : 1개
// 2 : 2개
// 3 : 2개
// 4 : 1개
// 5 : 2개
// -> 1,1,2,2,2 : k = 4 따라서 2가지.
// -> k = 5라면, 3가지.