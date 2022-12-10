package programmers.Lv0_problems;

//        NumberOfDice numberOfDice = new NumberOfDice();
//
//                int[][] boxes = {{1,1,1}, {10,8,6}};
//                int[] n = {1,3};
//
//                for(int i = 0; i < boxes.length; i++) {
//        System.out.println(numberOfDice.solution(boxes[i], n[i]));
//        }

public class NumberOfDice {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int range : box) {
            answer *= (range/n);
        }
        return answer;
    }
}
