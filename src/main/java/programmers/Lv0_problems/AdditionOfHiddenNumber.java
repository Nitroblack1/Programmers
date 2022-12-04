package programmers.Lv0_problems;

//        AdditionOfHiddenNumber additionOfHiddenNumber = new AdditionOfHiddenNumber();
//                String[] my_string = {"aAb1B2cC34oOp", "1a2b3c4d123Z", "fwfid2r45"};
//
//                for(String testCase : my_string) {
//                System.out.println(additionOfHiddenNumber.solution(testCase));
//                }

public class AdditionOfHiddenNumber {

    public int solution(String my_string) {
        String numberPattern = "^[0-9]*$";
        StringBuilder sb = new StringBuilder();
        String[] my_str = my_string.split("");
        int answer = 0;
        for (int i = 0; i < my_str.length; i++) {
            while (i < my_str.length && my_str[i].matches(numberPattern)) {
                sb.append(my_str[i]);
                i++;
            }
            if (sb.length() > 0) {
                answer += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                i--;
            }
        }
        return answer;
    }
}
