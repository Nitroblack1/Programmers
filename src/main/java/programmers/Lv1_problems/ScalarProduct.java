package programmers.Lv1_problems;

//        ScalarProduct scalarProduct = new ScalarProduct();
//
//                int[][] a = {{1,2,3,4}, {-1,0,1}};
//                int[][] b = {{-3,-1,0,2}, {1,0,-1}};
//
//                for(int i  = 0; i < a.length; i++) {
//        System.out.println(scalarProduct.solution(a[i], b[i]));
//        }

public class ScalarProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }
}
