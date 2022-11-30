package programmers.Lv0_problems;


//        String[] my_string = {"hello", "I love you"};
//                int[] num1_2 = {1,3,2,6};
//                for (int i = 0; i < 2; i++) {
//        System.out.println(ChangeIndex.solution(my_string[i], num1_2[i], num1_2[i + 2]));
//        }

public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) { // I love you, 3(o), 6(" ")
        StringBuilder sb = new StringBuilder(my_string);
        sb.insert(num1, my_string.charAt(num2)).deleteCharAt(num2 + 1); // I l ove you -> I l oveyou
        sb.insert(num2 + 1, my_string.charAt(num1)).deleteCharAt(num1 + 1); // I l oveoyou
        return sb.toString();
    }
}
