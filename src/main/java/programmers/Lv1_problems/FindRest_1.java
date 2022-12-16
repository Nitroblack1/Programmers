package programmers.Lv1_problems;

//        FindRest_1 findRest_1 = new FindRest_1();
//                int[] ns = {10, 12};
//
//                for(int n : ns) {
//                System.out.println(findRest_1.solution(n));
//                }

public class FindRest_1 {
    public int solution(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return 0;
    }
}
