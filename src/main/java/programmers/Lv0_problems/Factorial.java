package programmers.Lv0_problems;

//        Factorial factorial = new Factorial();
//
//                int[] n = {3628800, 7};
//                for(int test : n) {
//                System.out.println(factorial.solution(test));
//                }

public class Factorial {
    public int solution(int n) {
        int answer = 1;
        int index = 1;
        while (answer <= n) { // 1,1,2,6,24
            answer *= index; // 1*1/1*2/2*3/6*4
            index++;  // 2,3,4,5
        }
        return index - 2;
    }
}
