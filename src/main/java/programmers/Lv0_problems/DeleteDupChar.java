package programmers.Lv0_problems;

import java.util.Arrays;
import java.util.stream.Collectors;


//        String[] my_string = {"people", "We are the world"};
//                for(String testCase : my_string) {
//                System.out.println(DeleteDupChar.solution(testCase));
//                }

public class DeleteDupChar {
    public String solution(String my_string) {
        return Arrays.stream(my_string.split("")).distinct().collect(Collectors.joining(""));
    }
}
