package programmers.Lv0_problems;

import java.util.Arrays;

//int[][] array = {{1,8,3}, {9,10,11,8}};
//        Arrays.stream(FindMaxNumber.solution(array[0])).forEach(System.out::println);
//        Arrays.stream(FindMaxNumber.solution(array[1])).forEach(System.out::println);

public class FindMaxNumber {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array).sorted().toArray()[array.length-1];
        for(int i = 0; i < array.length; i++) {
            if(array[i] == answer[0]) {
                answer[1] = i;
            }
        }
        return answer;
    }
}
