package programmers.Lv0_problems;


//        int[][] array = {{3,10,28}, {10,11,12}};
//                int[] n = {20, 13};
//                for(int i = 0; i < 2; i++) {
//        System.out.println(ClosestNumber.solution(array[i], n[i]));
//        }

public class ClosestNumber {
    public int solution(int[] array, int n) {
        int minGap = Math.abs(array[0] - n);
        int minElement = array[0];
        for(int element : array) {
            if (Math.min(Math.abs(element - n), minGap) == Math.abs(element - n)) {
                if(Math.abs(element - n) == minGap) {
                    minElement = Math.min(element, minElement);
                    continue;
                }
                minGap = Math.abs(element - n);
                minElement = element;
            };
        }
        return minElement;
    }
}
