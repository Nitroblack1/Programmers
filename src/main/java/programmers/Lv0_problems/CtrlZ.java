package programmers.Lv0_problems;

import java.util.Objects;

//        CtrlZ ctrlZ = new CtrlZ();
//                String[] s = {"1 2 Z 3", "10 20 30 40", "10 Z 20 Z 1", "10 Z 20 Z", "-1 -2 -3 Z"};
//
//                for(String testCase : s) {
//                System.out.println(ctrlZ.solution(testCase));
//                }

public class CtrlZ {
    public int solution(String s) {
        String[] elements = s.split(" ");
        int answer = 0;
        int pastElement = 0;
        for(String element : elements) {
            if (Objects.equals(element, "Z")) {
                answer -= pastElement;
                continue;
            }
            answer += Integer.parseInt(element);
            pastElement = Integer.parseInt(element);
        }
        return answer;
    }
}
