package programmers.Lv0_problems;

import java.util.Arrays;

//int case1 = 1234;
//        int case2 = 930211;
//        System.out.println(AddRadix.solution(case1));
//        System.out.println(AddRadix.solution(case2));

public class AddRadix {
    public int solution(int n) {
        return Arrays.stream(Integer.toString(n).split(""))
                .mapToInt(Integer::parseInt).sum();
    }
}
