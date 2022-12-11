package programmers.Lv0_problems;

import java.util.Arrays;

//        GetMode getMode = new GetMode();
//
//                int[][] arrays = {{1,2,3,3,3,4}, {1,1,2,2}, {1}};
//
//                for(int[] array : arrays) {
//                System.out.println(getMode.solution(array));
//                }

public class GetMode {
    public int solution(int[] array) {
        int count;
        int max = 0;
        int answer = 0;
        int[] elements = Arrays.stream(array).distinct().toArray();
        for(int element : elements) {
            count = 0;
            for(int i = 0; i < array.length; i++) {
                if(element == array[i]) {
                    count++;
                }
            }
            if(Math.max(max, count) == count) {
                if (max == count) {
                    answer = -1;
                }
                else {
                    answer = element;
                }
            }
            max = Math.max(max, count);
        }
        return answer;
    }
}
