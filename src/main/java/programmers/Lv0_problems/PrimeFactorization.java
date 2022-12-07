package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.List;

//        PrimeFactorization primeFactorization = new PrimeFactorization();
//                int[] n = {12,17,420};
//
//                for(int testCase : n) {
//                Arrays.stream(primeFactorization.solution(testCase)).forEach(System.out::print);
//                System.out.println();
//                }

public class PrimeFactorization {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int prime = 2; prime <= n; prime++) {
            if (n % prime == 0) {
                answer.add(prime);
                while (n % prime == 0) {
                    n /= prime;
                }
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
