package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

//        UniqueOrder uniqueOrder = new UniqueOrder();
//                int[][] numList = {{1,2,3,4,5,6}, {10000,20,36,47,40,6,10,7000}};
//                int[] n = {1, 30};
//
//                for(int i = 0; i < 2; i++) {
//        Arrays.stream(uniqueOrder.solution(numList[i], n[i])).forEach(System.out::print);
//        System.out.println();
//        }

public class UniqueOrder {
    public int[] solution(int[] numList, int n) {
        int[] answer = new int[numList.length];
        List<Integer> distance = new ArrayList<>();
        for(int num : numList) {
            distance.add(Math.abs(num - n));
        }
        distance.sort(Comparator.naturalOrder());
        // 0, 1, 2, 3, 4, 5
        for(int i = 0; i < numList.length - 1; i++) {
            if(Objects.equals(distance.get(i), distance.get(i + 1))) {
                answer[i] = n + distance.get(i);
                answer[i+1] = n - distance.get(i);
                i++;
                continue;
            }
            boolean exist = false;
            for(int number : numList) {
                if (n + distance.get(i) == number) {
                    exist = true;
                    answer[i] = number;
                    break;
                }
            }
            if (!exist) {
                for (int number : numList) {
                    if (Math.abs(n - distance.get(i)) == number) {
                        answer[i] = number;
                        break;
                    }
                }
            }
        }
        boolean finalExist = false;
        for(int number : numList) {
            if (n + distance.get(numList.length - 1) == number) {
                answer[answer.length - 1] = number;
                finalExist = true;
                break;
            }
        }
        if (!finalExist) {
            for (int number : numList) {
                if (Math.abs(n - distance.get(numList.length - 1)) == number) {
                    answer[answer.length - 1] = number;
                    break;
                }
            }
        }
        return answer;
    }
}
