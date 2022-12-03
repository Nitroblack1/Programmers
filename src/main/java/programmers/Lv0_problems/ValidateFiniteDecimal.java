package programmers.Lv0_problems;

//        ValidateFiniteDecimal validateFiniteDecimal = new ValidateFiniteDecimal();
//                int[] a = {7, 11, 12};
//                int[] b = {20, 22, 21};
//
//                for(int i = 0; i < 3; i++) {
//        System.out.println(validateFiniteDecimal.solution(a[i], b[i]));
//        }

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

        while(denominator != 1) {
            if (denominator % 2 == 0) {
                denominator /= 2;
            }
            else if (denominator % 5 == 0) {
                denominator /= 5;
            }
            else {
                return 2;
            }
        }
        return 1;
    }
}
