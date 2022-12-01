package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.List;

public class ValidateFiniteDecimal {
    public int solution(int a, int b) {
        int big = Math.max(a, b); // 25
        int small = Math.min(a, b); // 10
        int n;
        while(small != 0) {
            n = big % small; // 5 -> 0
            big = small; // 10 -> 5
            small = n; // 5 -> 0
        }
        int denominator = b / big;

        return 2;
    }
}
