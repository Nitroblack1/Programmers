package programmers;

import programmers.Lv0_problems.ValidateFiniteDecimal;

public class Main {

    public static void main(String[] args) {
        ValidateFiniteDecimal validateFiniteDecimal = new ValidateFiniteDecimal();
        int[] a = {7, 11, 12};
        int[] b = {20, 22, 21};

        for(int i = 0; i < 3; i++) {
            System.out.println(validateFiniteDecimal.solution(a[i], b[i]));
        }
    }
}
