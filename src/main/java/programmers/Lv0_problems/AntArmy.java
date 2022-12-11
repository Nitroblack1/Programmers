package programmers.Lv0_problems;

//        AntArmy antArmy = new AntArmy();
//
//                int[] hp = {23,24,999};
//
//                for(int i : hp) {
//                System.out.println(antArmy.solution(i));
//                }

public class AntArmy {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;
        hp %= 5;
        answer += hp / 3;
        hp %= 3;
        answer += hp;
        return answer;
    }
}