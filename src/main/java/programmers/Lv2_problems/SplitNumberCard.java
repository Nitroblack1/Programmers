package programmers.Lv2_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//        SplitNumberCard splitNumberCard = new SplitNumberCard();
//
//                int[][] arrayA = {{10, 17}, {10, 20}, {14, 35, 119}};
//                int[][] arrayB = {{5, 20}, {5, 17}, {18, 30, 102}};
//
//                for (int i = 0; i < arrayB.length; i++) {
//        System.out.println(splitNumberCard.solution(arrayA[i], arrayB[i]));
//        }

public class SplitNumberCard {

    private List<Integer> divisors;

    private void findDivisors(int num) {

        divisors = new ArrayList<>();

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                divisors.add(num / i);
            }
        }

        divisors.add(num);
    }

    boolean canDivideAllElement(int divisor, int[] arr) {
        for (int num : arr)
            if (num % divisor != 0)
                return false;
        return true;
    }

    boolean cantDivideAllElement(int divisor, int[] arr) {
        for (int num : arr)
            if (num % divisor == 0)
                return false;
        return true;
    }

    private int findNumSatisfyConditions(int[] divArr, int[] nonDivArr) {

        Arrays.sort(divArr);
        findDivisors(divArr[0]);

        divisors.sort(Collections.reverseOrder());

        for (int divisor : divisors) {
            if (canDivideAllElement(divisor, divArr)
                    && cantDivideAllElement(divisor, nonDivArr))
                return divisor;
        }

        return 0;
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int satisfyingNum;

        satisfyingNum = findNumSatisfyConditions(arrayA, arrayB);
        answer = Math.max(satisfyingNum, answer);

        satisfyingNum = findNumSatisfyConditions(arrayB, arrayA);
        answer = Math.max(satisfyingNum, answer);

        return answer;
    }
}