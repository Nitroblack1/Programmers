package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
//        System.out.println(Babbling.solution(babbling1));
//
//        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
//        System.out.println(Babbling.solution(babbling2));

public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;
        List<String> standards = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        for(String element : babbling) {
            String temp = element;
            for (String standard : standards) {
                temp = temp.replace(standard, "/");
            }
            if (temp.replace("/", "").equals("")) {
                answer++;
            }
        }
        return answer;
    }
}
