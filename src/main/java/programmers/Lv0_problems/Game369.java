package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//        int[] order = {3, 29423};
//                System.out.println(Game369.solution(order[0]));
//                System.out.println(Game369.solution(order[1]));
//                System.out.println(Game369.solution(3693691));

public class Game369 {
    public int solution(int order) {
        String clapPattern = "^[369]$";
        List<String> numbers = new ArrayList<>(Arrays.asList(Integer.toString(order).split("")));
        return (int)numbers.stream().filter(e->e.matches(clapPattern))
                .count();
    }
}
