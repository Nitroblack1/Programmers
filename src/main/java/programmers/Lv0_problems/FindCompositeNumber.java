package programmers.Lv0_problems;

//        FindCompositeNumber findCompositeNumber = new FindCompositeNumber();
//
//                int[] ns = {10,15};
//                for(int n : ns) {
//                System.out.println(findCompositeNumber.solution(n));
//                }

public class FindCompositeNumber {
    public int solution(int n ) {
        if (n < 4) {
            return 0;
        }
        int composite;
        int answer = 0;
        for(int i = 4; i <= n; i++) {
            composite = 2;
            for(int j = 2; j*j <= i; j++) {
                if(i % j == 0) {
                    composite++;
                }
            }
            if (composite > 2) {
                answer++;
            }
        }
        return answer;
    }
}
