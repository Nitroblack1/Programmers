package programmers.Lv2_problems;

//        MarkDot markDot = new MarkDot();
//
//                int[] k = {2,1};
//                int[] d = {4,5};
//
//                for(int i = 0; i < k.length; i++) {
//        System.out.println(markDot.solution(k[i], d[i]));
//        }

public class MarkDot {
    public long solution(int k, int d) {
        long answer = 0;
        for(int x = 0; x * k <= d; x++) {
            answer += Math.floor(Math.sqrt(Math.pow(d, 2) - Math.pow(x*k, 2))) / k + 1;
        }
        return answer;
    }
}
