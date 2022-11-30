package programmers.Lv0_problems;

//String my_string1 = "3 + 4";
//        String my_string2 = "5 - 3 + 6";
//        String my_string3 = "3 - -3";
//        String my_string4 = "-5 + -6 + 4";
//        System.out.println(CalculateString.solution(my_string1));
//        System.out.println(CalculateString.solution(my_string2));
//        System.out.println(CalculateString.solution(my_string3));
//        System.out.println(CalculateString.solution(my_string4));

public class CalculateString {

    public int solution(String my_string) {
        int answer = 0;
        String[] plus = my_string.split(" \\+ ");
        for(String plusElement : plus) {
            if (plusElement.length() == 1) {
                answer += Integer.parseInt(plusElement);
            }
            else {
                String[] minusElement = plusElement.split(" - ");
                answer += Integer.parseInt(minusElement[0]);
                for(int i = 1; i < minusElement.length; i++) {
                    answer -= Integer.parseInt(minusElement[i]);
                }
            }
        }
        return answer;
    }
}
