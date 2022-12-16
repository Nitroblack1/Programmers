package programmers.Lv1_problems;

//        NumberStringAndWord numberStringAndWord = new NumberStringAndWord();
//
//                String[] ss = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
//
//                for(String s : ss) {
//                System.out.println(numberStringAndWord.solution(s));
//                }

public class NumberStringAndWord {
    public int solution(String s) {
        String[] workSheet = s.split("");
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            try {
                answer.append(Integer.parseInt(workSheet[i]));
            } catch (NumberFormatException e) {
                while(translate(temp.toString()) == -1) {
                    temp.append(workSheet[i]);
                    i++;
                }
                answer.append(translate(temp.toString()));
                temp = new StringBuilder();
                i--;
            }
        }
        return Integer.parseInt(answer.toString());
    }

    private int translate(String s) {
        switch (s) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "zero":
                return 0;
            default :
                return -1;
        }
    }
}
