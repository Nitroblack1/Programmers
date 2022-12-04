package programmers.Lv0_problems;

import java.util.Arrays;

//        MakeMax makeMax = new MakeMax();
//
//                int[][] numbersArray = {{1, 2, -3, 4, -5}, {0, -31, 24, 10, 1, 9},
//                {10, 20, 30, 5, 5, 20, 5}, {-5, -1, 3}, {-1, 3}, {4, 3, -1}};
//                for(int i = 0; i < numbersArray.length; i++) {
//        System.out.println(makeMax.solution(numbersArray[i]));
//        }

public class MakeMax {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[numbers.length - 1] * numbers[numbers.length - 2],
                numbers[0] * numbers[1]);
    }
}
