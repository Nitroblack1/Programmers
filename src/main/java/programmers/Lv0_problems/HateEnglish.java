package programmers.Lv0_problems;

import java.util.HashMap;
import java.util.Map;


//        String[] numbers = {"onetwothreefourfivesixseveneightnine", "onefourzerosixseven"};
//                for (String number : numbers) {
//                System.out.println(HateEnglish.solution(number));
//                }

public class HateEnglish {
    public long solution(String numbers) {
        Map<String, String> numberMatch =  new HashMap<>();
        StringBuilder answer = new StringBuilder();
        numberMatch.put("zero", "0");
        numberMatch.put("one", "1");
        numberMatch.put("two", "2");
        numberMatch.put("three", "3");
        numberMatch.put("four", "4");
        numberMatch.put("five", "5");
        numberMatch.put("six", "6");
        numberMatch.put("seven", "7");
        numberMatch.put("eight", "8");
        numberMatch.put("nine", "9");
        int beginIndex = 0;
        int endIndex = 0;
        while(endIndex < numbers.length() - 1) {
            while(!numberMatch.containsKey(numbers.substring(beginIndex, endIndex))) {
                endIndex++;
            }
            answer.append(numberMatch.get(numbers.substring(beginIndex, endIndex)));
            beginIndex = endIndex;
        }
        return Long.parseLong(answer.toString());
    }
}
