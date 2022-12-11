package programmers.Lv0_problems;

//        SharePizza sharePizza = new SharePizza();
//
//                int[] ns = {6,10,4};
//                for(int n : ns) {
//                System.out.println(sharePizza.solution(n));
//                }

public class SharePizza {
    public int solution(int n) {
        int p = 1;
        while((6*p)%n!=0) {
            p++;
        }
        return p;
    }
}