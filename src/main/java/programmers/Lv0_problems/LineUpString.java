package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//        String my_string1 = "Bcad";
//                String my_string2 = "heLLo";
//                String my_string3 = "Python";
//
//                System.out.println(LineUpString.solution(my_string2));

public class LineUpString {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        my_string = my_string.toLowerCase();
        List<String> my_stringSort = new ArrayList<>(Arrays.asList(my_string.split("")));
        my_stringSort.sort(Comparator.naturalOrder());
        my_stringSort.forEach(sb::append);
        return sb.toString();
    }
}
