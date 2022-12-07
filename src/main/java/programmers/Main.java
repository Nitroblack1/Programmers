package programmers;

import programmers.Lv2_problems.ChooseTangerine;

public class Main {

    public static void main(String[] args) {
        ChooseTangerine chooseTangerine = new ChooseTangerine();

        int[] k = {6,4,2};
        int[][] tangerine = {{1, 3, 2, 5, 4, 5, 2, 3}, {1, 3, 2, 5, 4, 5, 2, 3}, {1, 1, 1, 1, 2, 2, 2, 3}};

        for(int i = 0; i < k.length; i++) {
            System.out.println(chooseTangerine.solution(k[i], tangerine[i]));
        }
    }
}
