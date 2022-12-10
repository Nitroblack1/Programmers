package programmers.Lv0_problems;

import java.math.BigInteger;

//        DivideBeadsCase divideBeadsCase = new DivideBeadsCase();
//
//                int[] balls = {30};
//                int[] share = {15};
//
//                for(int i = 0; i < balls.length; i++) {
//        System.out.println(divideBeadsCase.solution(balls[i], share[i]));
//        }

public class DivideBeadsCase {
    public int solution(int balls, int share) {
        return factorial(balls, share);
    }

    private int factorial(int n, int r) {
        BigInteger result = new BigInteger("1");
        BigInteger R = new BigInteger("1");
        for(int i = n; i > (n-r); i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        for(int i = 1; i <= r; i++) {
            R = R.multiply(BigInteger.valueOf(i));
        }
        return Integer.parseInt(result.divide(R).toString());
    }
}


// nCr = n!(n-r)!/(n-r)!

// 5C3 = 5.4.3.2.1 / 3.2.1
// 5C2 = 5.4.3.2.1 / 5.4.3, 2.1
