package programmers.Lv0_problems;

import java.util.Arrays;

//        SortString sortString = new SortString();
//
//                String[] my_strings = {"hi12392", "p2o4i8gj2", "abcde0"};
//                for(String my_string : my_strings) {
//                Arrays.stream(sortString.solution(my_string)).forEach(System.out::print);
//                }

public class SortString {

    public int[] solution(String my_string) {
        final String numberPattern = "^[0-9]$";
        int[] answer = Arrays.stream(my_string.split("")).filter(e -> e.matches(numberPattern))
                .map(Integer::parseInt).mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
