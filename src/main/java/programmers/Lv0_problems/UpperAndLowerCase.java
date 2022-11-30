package programmers.Lv0_problems;


//        String[] my_string = {"cccCCC", "abCdEfghIJ"};
//                for(String testCase : my_string) {
//                System.out.println(UpperAndLowerCase.solution(testCase));
//                }

public class UpperAndLowerCase {
    public String solution(String my_string) {
        String UpperPattern = "^[A-Z]$";
        String[] myString = my_string.split("");

        for(int i = 0; i < myString.length; i++) {
            if (myString[i].matches(UpperPattern)) {
                myString[i] = myString[i].toLowerCase();
            }
            else {
                myString[i] = myString[i].toUpperCase();
            }
        }
        return String.join("", myString);
    }
}
