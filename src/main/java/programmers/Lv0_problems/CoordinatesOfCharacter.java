package programmers.Lv0_problems;

//        CoordinatesOfCharacter coordinatesOfCharacter = new CoordinatesOfCharacter();
//
//                String[][] keyinput = {{"left", "right", "up", "right", "right"}, {"down", "down", "down", "down", "down"}};
//                int[][] board = {{11,11}, {7,9}};
//
//                for(int i = 0; i < keyinput.length; i++) {
//        Arrays.stream(coordinatesOfCharacter.solution(keyinput[i], board[i])).forEach(System.out::print);
//        System.out.println("");
//        }

public class CoordinatesOfCharacter {
    public int[] solution(String[] keyinput, int[] board) {
        int horizontalRange = (board[0] - 1) / 2;
        int verticalRange = (board[1] - 1) / 2;

        int[] answer = new int[2];
        for(String input : keyinput) {
            switch (input) {
                case "left":
                    if (answer[0] - 1 >= -horizontalRange) {
                        answer[0] -= 1;
                    }
                    break;
                case "right":
                    if (answer[0] + 1 <= horizontalRange) {
                        answer[0] += 1;
                    }
                    break;
                case "up":
                    if (answer[1] + 1 <= verticalRange) {
                        answer[1] += 1;
                    }
                    break;
                case "down":
                    if (answer[1] - 1 >= -verticalRange) {
                        answer[1] -= 1;
                    }
                    break;
                default :
                    break;
            }
        }
        return answer;
    }
}
