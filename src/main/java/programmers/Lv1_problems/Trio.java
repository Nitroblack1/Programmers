package programmers.Lv1_problems;

//        Trio trio = new Trio();
//
//                int[][] numbers = {{-2,3,0,2,-5}, {-3,-2,-1,0,1,2,3}, {-1,1,-1,1}};
//
//                for(int[] number : numbers) {
//                System.out.println(trio.solution(number));
//                }

public class Trio {

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
