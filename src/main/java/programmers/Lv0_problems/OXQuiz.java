package programmers.Lv0_problems;

/* 알고리즘
1. '='을 기준으로 split한다.
2. (좌변) 만약 ' - '을 가지고 있다면 -> ' - '로 split
3. 스플릿한 원소들을 int화하여 계산한 후 우변의 값과 비교
4. (좌변) 만약 ' + '을 가지고 있다면 -> ' + '로 split
5. 스플릿한 원소들을 int화하여 계산한 후 우변의 값과 비교

궁금증 : 음수도 int화하면 음수로 받아들여지는가? -> Yes.
 */

//String[] case1 = {"3 - 4 = -3", "5 + 6 = 11"};
//        String[] case2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
//        Arrays.stream(OXQuiz.solution(case1)).forEach(System.out::println);
//        Arrays.stream(OXQuiz.solution(case2)).forEach(System.out::println);

public class OXQuiz {

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] equationTemp;
            String[] leftEquation;
            equationTemp = quiz[i].split(" = ");
            if (equationTemp[0].contains(" - ")) {
                leftEquation = equationTemp[0].split(" - ");
                if (Integer.parseInt(leftEquation[0]) - Integer.parseInt(leftEquation[1])
                        == Integer.parseInt(equationTemp[1])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                leftEquation = equationTemp[0].split(" \\+ ");
                if (Integer.parseInt(leftEquation[0]) + Integer.parseInt(leftEquation[1])
                        == Integer.parseInt(equationTemp[1])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
