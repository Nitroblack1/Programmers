package programmers.Lv0_problems;

//        NumberOfPair numberOfPair = new NumberOfPair();
//
//                int[] ns = {20,100};
//                for(int n : ns) {
//                System.out.println(numberOfPair.solution(n));
//                }

public class NumberOfPair {

    public int solution(int n) {
        int answer = 2;
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }
        return answer;
    }
}
