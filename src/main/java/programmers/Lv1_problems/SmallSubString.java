package programmers.Lv1_problems;

//        SmallSubString smallSubString = new SmallSubString();
//
//                String[] t = {"3141592", "500220839878", "10203"};
//                String[] p = {"271", "7", "15"};
//
//                for(int i = 0; i < t.length; i++) {
//        System.out.println(smallSubString.solution(t[i], p[i]));
//        }

public class SmallSubString {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
