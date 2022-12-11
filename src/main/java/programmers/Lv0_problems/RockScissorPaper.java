package programmers.Lv0_problems;

//        RockScissorPaper rockScissorPaper = new RockScissorPaper();
//
//                String[] rsp = {"2", "205"};
//                for(String test : rsp) {
//                System.out.println(rockScissorPaper.solution(test));
//                }

public class RockScissorPaper {

    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (String match : rsp.split("")) {
            if (Integer.parseInt(match) == 2) {
                answer.append("0");
            }
            if (Integer.parseInt(match) == 0) {
                answer.append("5");
            }
            if (Integer.parseInt(match) == 5) {
                answer.append("2");
            }
        }
        return answer.toString();
    }
}
