package programmers.Lv0_problems;

//String A = "hello";
//        String B = "ohell";
//        String C = "apple";
//        String D = "elppa";
//        String E = "pleap";
//        String F = "a";
//        String G = "a";
//        System.out.println(PushString.solution(C, E));

public class PushString {
    public static int solution(String A, String B) {
        StringBuffer sb = new StringBuffer(A);
        for(int i = 0; i < A.length(); i++) {
            if (sb.toString().equals(B)) {
                return i;
            }
            sb.insert(0, sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
        }
        return -1;
    }
}
