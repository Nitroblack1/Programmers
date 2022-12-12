package programmers.Lv1_problems;

//        ClosestFrontChar closestFrontChar = new ClosestFrontChar();
//
//                String[] test = {"banana", "foobar"};
//
//                for(String s : test) {
//                Arrays.stream(closestFrontChar.solution(s)).forEach(System.out::print);
//                System.out.println();
//                }

public class ClosestFrontChar {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}


// b / ba / ban / bana