package programmers.Lv0_problems;

import java.util.Arrays;


//        int[] IJK = {1,10,3,13,50,10,1,5,2};
//
//                for(int index = 0; index < 3; index++) {
//        System.out.println(NumberOfK.solution(IJK[index], IJK[index+3], IJK[index+6]));
//        }

public class NumberOfK {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int index = i; index <= j; index++) {
            answer += Arrays.stream(Integer.toString(index).split(""))
                    .filter(e->e.equals(Integer.toString(k)))
                    .count();
        }
        return answer;
    }
}
