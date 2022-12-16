package programmers.Lv1_problems;

//        CommonDivider commonDivider = new CommonDivider();
//
//                int[] left = {13, 24};
//                int[] right = {17, 27};
//
//                for(int i = 0; i < left.length; i++) {
//        System.out.println(commonDivider.solution(left[i], right[i]));
//        }

public class CommonDivider {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(validateOddOrEven(i) % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }

    private int validateOddOrEven(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
