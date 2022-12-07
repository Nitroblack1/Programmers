package programmers.Lv1_problems;

import java.util.Objects;

public class SplitStringsCustomizeVersion2 {

    public int solution(String s) { // aaabbaccccabba
        if(s.length() == 1) {
            return 1;
        }
        String[] arrayS = s.split("");
        String first = arrayS[0];
        String second = arrayS[1];
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isFirst = true;
        boolean isSecond = true;
        int answer = 0;
        for(int i = 0; i < arrayS.length; i++) {
            if (isFirst) {
                first = arrayS[i];
                firstNumber = 1;
                isFirst = false;
            } else if (!Objects.equals(arrayS[i], first) && isSecond) {
                second = arrayS[i];
                secondNumber = 1;
                isSecond = false;
            }
            else if (!Objects.equals(arrayS[i], first) && !Objects.equals(arrayS[i], second)){
                first = second;
                firstNumber = secondNumber;
                second = arrayS[i];
                secondNumber = 1;
            }
            else {
                if (Objects.equals(arrayS[i], first)) {
                    firstNumber++;
                }
                if (Objects.equals(arrayS[i], second)) {
                    secondNumber++;
                }
            }
            if(firstNumber != 0 && firstNumber == secondNumber) {
                answer++;
                isFirst = true;
                isSecond = true;
                firstNumber = 0;
                secondNumber = 0;
            }
            if(firstNumber != secondNumber && i + 1 == arrayS.length) {
                answer++;
            }
        }
        return answer;
    }
}

// aaabbaccccabba
// 첫 글자를 읽고 이를 first 로 정한다.
// first 글자의 개수를 카운트한다.
// 새로운 문자가 들어오면 이를 second 로 선언하여 카운트한다.
// 만약 새로운 문자가 들어오면 기존 글자를 지우고, second 를 first 로, 새 문자를 second 로 선언한다.
// second 의 개수역시 first 로 옮기고, 새 문자에 대한 개수를 0으로 초기화하여 카운트한다.
// 만약 두 카운트 값이 같다면 해당 문자열까지 자르고(+1), 처음부터 다시 시작한다.
// 만약 남은 부분이 없다면 종료하지만, 횟수가 다른 상태에서 더 이상 읽을 수 없다면, 문자열을 분리하고(+1) 종료한다.