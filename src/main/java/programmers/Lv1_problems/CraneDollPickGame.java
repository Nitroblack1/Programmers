package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//        CraneDollPickGame craneDollPickGame = new CraneDollPickGame();
//
//                int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
//                int[] moves = {1,5,3,5,1,2,1,4};
//
//                System.out.println(craneDollPickGame.solution(board, moves));

public class CraneDollPickGame {

    public int solution(int[][] board, int[] moves) {
        List<Integer> budget = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    budget.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] -= board[j][moves[i]-1];
                    break;
                }
            }
            if (budget.size() > 1 && Objects.equals(budget.get(budget.size() - 1), budget.get(budget.size() - 2))) {
                budget.remove(budget.size()-1);
                budget.remove(budget.size()-1);
                answer += 2;
            }
        }
        return answer;
    }
}