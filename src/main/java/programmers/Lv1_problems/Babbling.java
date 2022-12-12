package programmers.Lv1_problems;

//        Babbling babbling = new Babbling();
//
//                String[][] babblings = {{"aya", "yee", "u", "maa"},
//                {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"},
//                {"mayaa", "ymaeaya"}};
//                for (String[] babble : babblings) {
//                System.out.println(babbling.solution(babble));
//                }

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possibleBabble = {"aya", "ye", "woo", "ma"};
        for(String babble : babbling) {
            for(String possible : possibleBabble) {
                if(babble.replace(possible, "/").contains("//")) {
                    break;
                }
                babble = babble.replace(possible, ".");
            }
            if (babble.replace(".", "").length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}
