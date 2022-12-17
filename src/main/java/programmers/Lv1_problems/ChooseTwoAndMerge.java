package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.List;

//        ChooseTwoAndMerge chooseTwoAndMerge = new ChooseTwoAndMerge();
//
//                int[][] numberses = {{2,1,3,4,1}, {5,0,2,7}};
//
//                for(int[] numbers : numberses) {
//                Arrays.stream(chooseTwoAndMerge.solution(numbers)).forEach(System.out::print);
//                System.out.println();
//                }

public class ChooseTwoAndMerge {
    public int[] solution(int[] numbers) {
        List<Integer> sheet = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sheet.add(numbers[i]+numbers[j]);
            }
        }
        return sheet.stream().distinct().mapToInt(e->e).sorted().toArray();
    }
}

// 1,1,2,3,4
// 2,3,4,5,3,4,5,5,6,7
// 2,3,4,5,6,7