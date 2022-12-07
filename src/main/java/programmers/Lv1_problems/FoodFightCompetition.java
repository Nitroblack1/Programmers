package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//        FoodFightCompetition foodFightCompetition = new FoodFightCompetition();
//
//                int[][] foods = {{1,3,4,6}, {1,7,1,2}};
//
//                for(int[] food : foods) {
//                System.out.println(foodFightCompetition.solution(food));
//                }

public class FoodFightCompetition {

    public String solution(int[] food) {
        int[] foodNum = new int[food.length - 1];
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 1) {
                foodNum[i - 1] = food[i] - 1;
            } else {
                foodNum[i - 1] = food[i];
            }
        } // [6,0,2]
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < foodNum.length; i++) {
            for (int number = 0; number < foodNum[i]/2; number++) {
                answerList.add(i+1);
            }
        }
        answerList.add(0);
        for (int i = foodNum.length - 1; i >= 0; i--) {
            for (int number = 0; number < foodNum[i]/2; number++) {
                answerList.add(i+1);
            }
        }
        return answerList.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
