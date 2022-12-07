package programmers.Lv3_problems.solving;

import java.util.Arrays;

//        MultiplicationTable multiplicationTable = new MultiplicationTable();
//                int e = 8;
//                int[] starts = {1, 3, 7};
//
//                Arrays.stream(multiplicationTable.solution(e, starts)).forEach(System.out::print);

public class MultiplicationTable {

    public int[] solution(int e, int[] starts) {
        int[] answer = new int[starts.length];
        int decimal;
        if (e == 1) {
            return Arrays.stream(answer).map(t -> 1).toArray();
        }
        int currentAnswer = 0;
        int maxDecimal = 0;
        for (int answerIndex = 0; answerIndex < starts.length; answerIndex++) {
            for (int i = starts[answerIndex]; i <= e; i++) {
                decimal = 1;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        decimal++;
                    }
                }
                if (decimal > maxDecimal) {
                    maxDecimal = decimal;
                    currentAnswer = i;
                } else if (decimal == maxDecimal) {
                    currentAnswer = Math.min(currentAnswer, i);
                }
            }
            answer[answerIndex] = currentAnswer;
            maxDecimal = 0;
        }
        return answer;
    }
}
// range(starts[i]~e)
// 각 숫자별 약수의 개수를 구하여 최대 약수(Math.max 로 계속 바꿔줘야 할 듯) 에 해당하는 수를 answer 에 넣는다.
// 최대 약수가 같다면 더 작은 수를 answer 에 넣는다.
// 약수를 구하는 알고리즘
// 2부터 본인 수 / 2 까지 한 후 + 1(처음 1) + 1(본인 수)
// 21 -> 1,3,7,21
// 81 -> 1,3,9,27,81

// 1~8
// 1 : 1
// 2 : 2
// 3 : 2
// 4 : 3
// 5 : 2
// 6 : 4
// 7 : 2
// 8 : 4

// 1 : 1
// 2 : 2,3,5,7
// 3 : 4
// 4 : 6,8 -> 6

// 3~8 -> 6

// 7~8 -> 8