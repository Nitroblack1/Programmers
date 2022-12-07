package programmers;

import programmers.Lv2_problems.solving.SplitNumberCard;

public class Main {

    public static void main(String[] args) {
        SplitNumberCard splitNumberCard = new SplitNumberCard();

        int[][] arrayA = {{10, 17}, {10, 20}, {14, 35, 119}};
        int[][] arrayB = {{5, 20}, {5, 17}, {18, 30, 102}};

        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(splitNumberCard.solution(arrayA[i], arrayB[i]));
        }
    }
}


