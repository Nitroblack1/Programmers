package programmers.Lv0_problems;

import java.util.Arrays;
import java.util.Comparator;


//        String[] testCase = {"olleh", "allpe", "hello", "apple"};
//                for(int i = 0; i < 2; i++) {
//        System.out.println(MakeBWithA.solution(testCase[i], testCase[i + 2]));
//        }

public class MakeBWithA {
    public int solution(String before, String after) {
        if (Arrays.equals(
                Arrays.stream(before.split("")).sorted(Comparator.naturalOrder()).toArray(),
                Arrays.stream(after.split("")).sorted(Comparator.naturalOrder()).toArray())) {
            return 1;
        }
        return 0;
    }
}
