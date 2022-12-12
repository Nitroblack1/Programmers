package programmers.Lv1_problems;

import java.util.HashMap;
import java.util.Map;

//        CharacterTest characterTest = new CharacterTest();
//
//                String[][] surveys = {{"AN", "CF", "MJ", "RT", "NA"}, {"TR", "RT", "TR"}};
//                int[][] choiceses = {{5,3,2,7,5}, {7,1,3}};
//
//                for(int i = 0; i < surveys.length; i++) {
//        System.out.println(characterTest.solution(surveys[i], choiceses[i]));
//        }

public class CharacterTest {

    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        Map<String, Integer> result = new HashMap<>();
        result.put("R", 0);
        result.put("T", 0);
        result.put("C", 0);
        result.put("F", 0);
        result.put("J", 0);
        result.put("M", 0);
        result.put("A", 0);
        result.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            String disagree = survey[i].split("")[0];
            String agree = survey[i].split("")[1];
            if (choices[i] - 4 < 0) {
                result.replace(disagree, result.get(disagree) + (4 - choices[i]));
            } else if (choices[i] - 4 > 0) {
                result.replace(agree, result.get(agree) + (choices[i] - 4));
            }
        }
        answer.append(Math.max(result.get("R"), result.get("T")) == result.get("R") ? "R":"T");
        answer.append(Math.max(result.get("C"), result.get("F")) == result.get("C") ? "C":"F");
        answer.append(Math.max(result.get("J"), result.get("M")) == result.get("J") ? "J":"M");
        answer.append(Math.max(result.get("A"), result.get("N")) == result.get("A") ? "A":"N");
        return answer.toString();
    }
}

// RT/CF/JM/AN
// n개 질문
// 7개 선택지 (-3~3) : 음수는 R, 양수는 T 이런식
// 매우~ : 3점, 일반 : 2점, 약간 : 1점 고정
// 같을 경우 사전순으로 빠른 것 선택
// "AN" -> 비동의(음수) : A, 동의(양수) : N
// x - 4
// N : 1
// C : 1
// M : 2
// T : 3
// A : 1
// TCMA
