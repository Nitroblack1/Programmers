package programmers.Lv0_problems;

import programmers.Main;


//        int n1 = 2;
//                int t1 = 10;
//                int n2 = 7;
//                int t2 = 15;
//                System.out.println(Bacteria.solution(n1, t1));
//                System.out.println(Bacteria.solution(n2, t2));

public class Bacteria {
    public static int solution(int n, int t) {
        return (int)(n*Math.pow(2, t));
    }
}
