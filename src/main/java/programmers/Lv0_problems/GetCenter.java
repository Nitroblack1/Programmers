package programmers.Lv0_problems;

import java.util.Arrays;

//        GetCenter getCenter = new GetCenter();
//
//                int[][] arrays = {{1,2,7,10,11}, {9,-1,0}};
//
//                for(int[] array : arrays) {
//                System.out.println(getCenter.solution(array));
//                }

public class GetCenter {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
