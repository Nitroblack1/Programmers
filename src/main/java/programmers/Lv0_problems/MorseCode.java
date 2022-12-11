package programmers.Lv0_problems;

import java.util.Objects;

//        MorseCode morseCode = new MorseCode();
//
//                String[] letters = {".... . .-.. .-.. ---", ".--. -.-- - .... --- -."};
//
//                for(String letter : letters) {
//                System.out.println(morseCode.solution(letter));
//                }

public class MorseCode {
    public String solution(String letter) {
        return decodeMorseCode(letter);
    }

    private String decodeMorseCode(String letter) {
        StringBuilder answer = new StringBuilder();
        String morseCode = ".-:a,-...:b,-.-.:c,-..:d,.:e,..-.:f,--.:g,....:h,..:i," +
        ".---:j,-.-:k,.-..:l,--:m,-.:n,---:o,.--.:p,--.-:q,.-.:r,...:s,-:t,..-:u," +
        "...-:v,.--:w,-..-:x,-.--:y,--..:z";
        String[] letterCode = letter.split(" ");
        for(int i = 0; i < letterCode.length; i++) {
            for (String morse : morseCode.split(",")) {
                if (Objects.equals(letterCode[i], morse.split(":")[0])) {
                    answer.append(morse.split(":")[1]);
                }
            }
        }
        return answer.toString();
    }
}
