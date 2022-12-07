package programmers.Lv0_problems;

//        AddHiddenNumber addHiddenNumber = new AddHiddenNumber();
//                String[] my_strings = {"aAb1B2cC34oOp", "1a2b3c4d123"};
//
//                for(String my_string : my_strings) {
//                System.out.println(addHiddenNumber.solution(my_string));
//                }

public class AddHiddenNumber {
    public int solution(String my_String) {
        int answer = 0;
        for(String element : my_String.split("")) {
            try {
                answer += Integer.parseInt(element);
            } catch (NumberFormatException e) {}
        }
        return answer;
    }
}
