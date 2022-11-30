package programmers.Lv0_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


//        String[] s = {"abcabcadc", "abdc", "hello"};
//                for(String testCase : s) {
//                System.out.println(CharOnce.solution(testCase));
//                }

public class CharOnce {

    public String solution(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        String answer = new String(temp);
        List<String> uniqueElements = Arrays.stream(answer.split("")).distinct()
                .collect(Collectors.toList());
        for(String uniqueElement : uniqueElements) {
            if (Arrays.stream(answer.split("")).filter(str-> Objects.equals(str, uniqueElement))
                    .count() > 1) {
                answer = answer.replace(uniqueElement, "");
            }
        }
        return answer;
    }
}
