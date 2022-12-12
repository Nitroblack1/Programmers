package programmers.Lv1_problems;

//        Cola cola = new Cola();
//
//                int[] a = {2,3,3};
//                int[] b = {1,1,2};
//                int[] n = {20,20,10};
//
//                for(int i = 0; i < a.length; i++) {
//        System.out.println(cola.solution(a[i], b[i], n[i]));
//        }

public class Cola {
    public int solution(int a, int b, int n) {
        int bottle = n;
        int answer = 0;
        int rest = 0;
        while(bottle/a >= 1) {
            while (bottle / a >= 1) {
                answer += (bottle / a) * b;
                rest += bottle % a;
                bottle = (bottle / a) * b;
            }
            bottle +=rest;
            rest = 0;
        }
        return answer;
    }
}