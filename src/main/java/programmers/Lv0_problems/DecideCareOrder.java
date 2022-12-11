package programmers.Lv0_problems;

import java.util.Arrays;
import java.util.Collections;

//        DecideCareOrder decideCareOrder = new DecideCareOrder();
//                int[][] emergencies = {{3,76,24}, {1,2,3,4,5,6,7}, {30,10,23,6,100}};
//
//                for(int[] emergency : emergencies) {
//                Arrays.stream(decideCareOrder.solution(emergency)).forEach(System.out::print);
//                System.out.println();
//                }

public class DecideCareOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] order = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(order, Collections.reverseOrder());
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = Arrays.asList(order).indexOf(emergency[i]) + 1;
        }
        return answer;
    }
}

// 3,76,24
// 76,24,3