package programmers.Lv0_problems;

import java.util.Arrays;

//int[] case1 = {7, 77, 17};
//        int[] case2 = {10, 29};
//
//        System.out.println(NumberOf7.solution(case2));

public class NumberOf7 {
    public int solution(int[] array) {
        int sum = 0;
        for(int element : array) {
            sum += Arrays.stream(Integer.toString(element).split(""))
                    .filter(e->e.equals("7"))
                    .count();
        }
        return sum;
    }
}
