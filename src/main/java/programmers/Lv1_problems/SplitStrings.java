package programmers.Lv1_problems;

import java.util.Objects;

//        SplitStrings splitStrings = new SplitStrings();
//
//                String[] s = {"banana", "abracadabra", "aaabbaccccabba"}; // ab,ra,ccar,bo,b
//
//                for(String testCase : s) {
//                System.out.println(splitStrings.solution(testCase));
//                }

public class SplitStrings {
    public int solution(String s) {
        String standard = s.split("")[0];
        int standardNumber = 0;
        int comparedNumber = 0;
        boolean isFirst = true;
        int answer = 0;
        if (s.length() == 1) {
            return 1;
        }
        for(String element : s.split("")) {
            if(isFirst) {
                standard = element;
                standardNumber = 1;
                isFirst = false;
            } else {
                if (Objects.equals(element, standard)) {
                    standardNumber++;
                } else {
                    comparedNumber++;
                }
            }
            if (standardNumber == comparedNumber && standardNumber != 0) {
                answer++;
                isFirst = true;
                standardNumber = 0;
                comparedNumber = 0;
            }
        }
        if (standardNumber != comparedNumber) {
            answer++;
        }
        return answer;
    }
}
