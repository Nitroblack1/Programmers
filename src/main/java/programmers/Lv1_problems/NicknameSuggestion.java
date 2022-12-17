package programmers.Lv1_problems;

//        NicknameSuggestion nicknameSuggestion = new NicknameSuggestion();
//
//                String[] new_ids = {"...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def",
//                "abcdefghijklmn.p"};
//                for(String new_id : new_ids) {
//                System.out.println(nicknameSuggestion.solution(new_id));
//                }

public class NicknameSuggestion {

    public String solution(String new_id) {
        return doSubstitution(new_id);
    }

    private String doSubstitution(String id) {
        id = id.toLowerCase().replaceAll("[^a-z|_|.|[-]|0-9]", "") // 1st, 2nd step
                .replaceAll("[.]{2,}", "."); // 3rd step
        return fourthSub(id);
    }

    private String fourthSub(String id) {
        if (id.charAt(0) == '.') {
            id = id.replaceFirst(".", "");
        }
        StringBuilder sb = new StringBuilder(id);
        if (id.length() > 1 && id.charAt(id.length() - 1) == '.') {
            sb.deleteCharAt(id.length()-1);
        }
        return fifthSub(sb).toString();
    }

    private StringBuilder fifthSub(StringBuilder id) {
        if (id.length() == 0) {
            id.append("a");
        }
        return sixthSub(id);
    }

    private StringBuilder sixthSub(StringBuilder id) {
        if (id.length() >= 16) {
            id.delete(15, id.length());
            if (id.charAt(id.length() - 1) == '.') {
                id.deleteCharAt(id.length()-1);
            }
        }
        return seventhSub(id);
    }

    private StringBuilder seventhSub(StringBuilder id) {
        if (id.length() <= 2) {
            while(id.length() < 3) {
                id.append(id.charAt(id.length() - 1));
            }
        }
        return id;
    }
}