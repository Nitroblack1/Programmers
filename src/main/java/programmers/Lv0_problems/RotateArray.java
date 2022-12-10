package programmers.Lv0_problems;

import java.util.Objects;

//        RotateArray rotateArray = new RotateArray();
//
//                int[][] numbers = {{1,2,3}, {4,455,6,4,-1,45,6}};
//                String[] direction = {"right", "left"};
//
//                for(int i = 0; i < numbers.length; i++) {
//        Arrays.stream(rotateArray.solution(numbers[i], direction[i])).forEach(System.out::print);
//        System.out.println();
//        }

public class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(Objects.equals(direction, "right")) {
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }
        else {
            for(int i = 1; i < numbers.length; i++) {
                answer[i-1] = numbers[i];
            }
            answer[answer.length-1] = numbers[0];
        }
        return answer;
    }
}
