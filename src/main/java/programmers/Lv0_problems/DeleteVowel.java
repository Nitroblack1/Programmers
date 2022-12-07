package programmers.Lv0_problems;

//        DeleteVowel deleteVowel = new DeleteVowel();
//                String[] my_strings = {"bus", "nice to meet you"};
//
//                for(String my_String : my_strings) {
//                System.out.println(deleteVowel.solution(my_String));
//                }

public class DeleteVowel {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
