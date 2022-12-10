package programmers.Lv0_problems;

//        MakeTwoDimension makeTwoDimension = new MakeTwoDimension();
//
//                int[][] num_list = {{1,2,3,4,5,6,7,8}, {100,95,2,4,5,6,18,33,948}};
//                int[] n = {2,3};
//
//                for(int i = 0; i < num_list.length; i++) {
//        Arrays.stream(makeTwoDimension.solution(num_list[i], n[i])).forEach(System.out::print);
//        System.out.println();
//        }

public class MakeTwoDimension {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[i*n+j];
            }
        }
        return answer;
    }
}

// 1,2,3,4,5,6,7,8,9
// [1,2,3][4,5,6][7,8,9]
// 0 -> 0,1,2
// 1-> 3,4,5
// 2-> 6,7,8