package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//        SafeZone safeZone = new SafeZone();
//                int[][] territory1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0},
//                {0, 0, 0, 0, 0}};
//                int[][] territory2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0},
//                {0, 0, 0, 0, 0}};
//                int[][] territory3 = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
//
//                System.out.println(safeZone.solution(territory1));
//                System.out.println(safeZone.solution(territory2));
//                System.out.println(safeZone.solution(territory3));

public class SafeZone {
    public int solution (int[][] board) {
        List<List<Integer>> bombIndexes = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    bombIndexes.add(Arrays.asList(i, j));
                }
            }
        }
        List<List<Integer>> HazardZone = new ArrayList<>();
        for (List<Integer> bombIndex : bombIndexes) {
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board.length; c++) {
                    if (Math.abs(bombIndex.get(1) - c) <= 1 &&
                            Math.abs(bombIndex.get(0) - r) <= 1) {
                        HazardZone.add(Arrays.asList(r, c));
                    }
                }
            }
        }
        return (board.length)*(board.length) - (int)HazardZone.stream().distinct().count();
    }
}


//        00000
//        00000
//        00000
//        00100
//        00000 -> 16
//
//        00000
//        00000
//        00000
//        00110
//        00000 -> 13

// index 로 접근
// (3,2)에 있으므로 (2,1), (2,2), (2,3) / (3,1), (3,2) , (3,3) / (4,1), (4,2), (4,3) 제외
// 1) 주변 좌표의 존재 여부 2) 겹치는 좌표 여부
// 1) for 문에서 종, 횡에 대해 최대 길이까지만 좌표 컬렉션에 저장
// 2) 겹치는 좌표들에 대해서는 stream().distinct()로 제거하여 .count()로 최종 결과 리턴
