package programmers.Lv0_problems;

//String[] cipher = {"dfjardstddetckdaccccdegk", "pfqallllabwaoclk"};
//        int[] code = {4, 2};
//
//        for(int i = 0; i < 2; i++) {
//        System.out.println(Decoder.solution(cipher[i], code[i]));
//        }

public class Decoder {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < cipher.length(); i++) {

        }
        int index = 1;
        while(index * code - 1 < cipher.length()) {
            answer.append(cipher.charAt(index * code - 1));
            index++;
        }
        return answer.toString();
    }
}
