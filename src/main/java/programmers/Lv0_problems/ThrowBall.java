package programmers.Lv0_problems;

import java.util.Arrays;

//        ThrowBall throwBall = new ThrowBall();
//
//                int[][] numbers = {{1,2,3,4}, {1,2,3,4,5,6}, {1,2,3}};
//                int[] k = {2,5,3};
//
//                for(int i = 0; i < numbers.length; i++) {
//        System.out.println(throwBall.solution(numbers[i], k[i]));
//        }

public class ThrowBall {
    public int solution(int[] numbers, int k) {
        int[] workSheet = new int[numbers.length*(int)Math.ceil((double)(k*2)/numbers.length)];
        int workSheetIndex = 0;
        int index = 0;
        while(workSheet[workSheet.length-1] == 0) {
            workSheet[workSheetIndex] = numbers[index];
            if(index + 1 == numbers.length) {
                index = 0;
                workSheetIndex++;
                continue;
            }
            workSheetIndex++;
            index++;
        }
        Arrays.stream(workSheet).forEach(System.out::print);
        return workSheet[k*2-2];
    }
}

// 1,2,3,4,5,6,7,8 / 10 : 3
// 1,3,5,7,2,4,6,8,1,3 : 3
// 1,2,3,4,5,6,7 / 5 : 2
// 1,3,5,7,2
// 1,2,3,4 / 1 :