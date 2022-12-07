package programmers.Lv1_problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

//        SplitStringsCustomizedVersion splitStrings = new SplitStringsCustomizedVersion();
//                String[] testCases = {"banana", "abracadabra", "aaabbaccccabba"};
//
//                for (String testCase : testCases) {
//                System.out.println(splitStrings.solution(testCase));
//                }

public class SplitStringsCustomizedVersion {

    public int solution(String s) {
        int answer = 0;
        String[] sArray = s.split("");
        Map<String, Integer> currentMap = new LinkedHashMap<>();
        List<String> test = new ArrayList<>();
        String standard = sArray[0];
        boolean isFirst = true;
        for(int i = 0; i < sArray.length; i++) {
            if(isFirst) {
                standard = sArray[i];
            }
            isFirst = false;
            test.add(sArray[i]);

            if (!currentMap.containsKey(sArray[i])) {
                currentMap.put(sArray[i], 1);
            } else {
                currentMap.replace(sArray[i], currentMap.get(sArray[i]) + 1);
            }

            for (String compare : currentMap.keySet()) {
                if (Objects.equals(currentMap.get(standard), currentMap.get(compare)) &&
                        !Objects.equals(compare, standard)) {
                    answer++;
                    System.out.print(test + " / ");
                    currentMap = new LinkedHashMap<>();
                    isFirst = true;
                    test = new ArrayList<>();
                    break;
                }
            }
            if (i + 1 >= sArray.length && !currentMap.isEmpty()) {
                answer++;
                System.out.println(test);
            }
        }
        return answer;
    }
}