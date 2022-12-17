package programmers.Lv1_problems;

import java.util.Objects;

//        TouchKeyPad touchKeyPad = new TouchKeyPad();
//
//                int[][] numbers = {{1,3,4,5,8,2,1,4,5,9,5}, {7,0,8,2,8,3,1,5,7,6,2}, {1,2,3,4,5,6,7,8,9,0}};
//                String[] hand = {"right", "left", "right"};
//
//                for(int i = 0; i < numbers.length; i++) {
//        System.out.println(touchKeyPad.solution(numbers[i], hand[i]));
//        }

public class TouchKeyPad {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        String leftT = "*";
        String rightT = "#";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer.append("L");
                leftT = String.valueOf(numbers[i]);
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer.append("R");
                rightT = String.valueOf(numbers[i]);
            } else {
                for (numberMatch number : numberMatch.values()) {
                    if (Integer.parseInt(number.getNum()) == numbers[i]) {
                        answer.append(getThumb(leftT, rightT, hand, number));
                        if (answer.charAt(answer.length() - 1) == 'R') {
                            rightT = String.valueOf(numbers[i]);
                        } else if (answer.charAt(answer.length() - 1) == 'L') {
                            leftT = String.valueOf(numbers[i]);
                        }
                        break;
                    }
                }
            }
        }
        return answer.toString();
    }

    private String getThumb(String currentLeftT, String currentRightT, String hand,
            numberMatch num) {
        String[] hierarchy = num.getDistance().split("'");
        for (int i = 0; i < hierarchy.length; i++) {
            if (hierarchy[i].contains(currentLeftT) && hierarchy[i].contains(currentRightT)) {
                if (Objects.equals(hand, "left")) {
                    return "L";
                }
                return "R";
            } else if (hierarchy[i].contains(currentLeftT) && !hierarchy[i].contains(
                    currentRightT)) {
                return "L";
            } else if (hierarchy[i].contains(currentRightT) && !hierarchy[i].contains(
                    currentLeftT)) {
                return "R";
            }
        }
        return "";
    }
}

enum numberMatch {
    Two("2", "2'1,3,5'4,6,8'7,9,0'*,#"),
    Five("5", "5'2,4,6,8'1,3,7,9,0'*,#"),
    Eight("8", "8'5,7,9,0'4,6,*,#,2'1,3"),
    Zero("0", "0'8,*,#'7,9,5'4,6,2'1,3");

    private String num;
    private String distance;

    numberMatch(String num, String distance) {
        this.num = num;
        this.distance = distance;
    }

    public String getNum() {
        return this.num;
    }

    public String getDistance() {
        return this.distance;
    }
}

// 1,2,3 / 2:1,3,5'4,6'8'7,9'0'*,#
// 4,5,6 / 5:2,4,6,8'1,3,7,9'0'*,#
// 7,8,9 / 8:5,7,9,0'4,6,*,#'2'1,3
// *,0,# / 0:8,*,#'7,9'5'4,6'2'1,3

// 1
//      3
// 4
// 5
// 8
//      2
// 1
// 4
//*      5
//      9
// 5