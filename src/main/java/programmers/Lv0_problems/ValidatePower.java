package programmers.Lv0_problems;


//        int n1 = 144;
//                int n2 = 976;
//                System.out.println(ValidatePower.solution(n1));
//                System.out.println(ValidatePower.solution(n2));

public class ValidatePower {
    public static int solution(int n) {
        if (Math.sqrt(n) != Math.ceil(Math.sqrt(n))) {
            return 2;
        }
        return 1;
    }
}
