package programmers.Lv1_problems;

//        AddMinusPlus addMinusPlus = new AddMinusPlus();
//
//                int[][] absolutes = {{4,7,12}, {1,2,3}};
//                boolean[][] signs = {{true, false, true}, {false, false, true}};
//
//                for(int i = 0; i < absolutes.length; i++) {
//        System.out.println(addMinusPlus.solution(absolutes[i], signs[i]));
//        }

public class AddMinusPlus {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            }
            else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
