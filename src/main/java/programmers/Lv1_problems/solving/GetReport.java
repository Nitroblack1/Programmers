package programmers.Lv1_problems.solving;

import java.util.ArrayList;
import java.util.List;

public class GetReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        User[] users = new User[id_list.length];
        for(int i = 0; i < id_list.length; i++) {
            users[i] = new User(id_list[i]);
        }

        for(String reportInfo : report) {

        }
        return new int[0];
    }
}

class User {
    private String userId;
    private List<String> reportedUser;
    User(String id) {
        this.userId = id;
        reportedUser = new ArrayList<>();
    }

    public void setReportedUser() {

    }
}

//    Map<String, Integer> userSheet = new LinkedHashMap<>();
//    String[] updatedReport = Arrays.stream(report).distinct().toArray(String[]::new);
//    int[] answer = new int[id_list.length];
//        for (String id : id_list) {
//                userSheet.put(id, 0);
//                }
//                for (String reported : updatedReport) {
//                userSheet.replace(reported.split(" ")[1], userSheet.get(reported.split(" ")[1]) + 1);
//                }
//                System.out.println(userSheet);
//
//                List<String> penaltyUser = new ArrayList<>();
//        for(String user : userSheet.keySet()) {
//        if (userSheet.get(user) >= k) {
//        penaltyUser.add(user);
//        }
//        }
//
//        for(int i = 0; i < updatedReport.length; i++) {
//        if(penaltyUser.contains(report[i].split(" ")[1])) {
//        answer[Arrays.asList(id_list).indexOf(report[i].split(" ")[0])]++;
//        }
//        }
//        return answer;

// 동일한 유저에 대한 신고 횟수는 1회로 처리된다.
// k번 이상 -> 정지 사실 메일로 발송

// k번 이상


//    GetReport getReport = new GetReport();
//
//    String[][] id_list = {{"muzi", "frodo", "apeach", "neo"}, {"con", "ryan"}};
//    String[][] report = {
//            {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
//            {"ryan con", "ryan con", "ryan con", "ryan con"}};
//    int[] k = {2,3};
//
//        for(int i = 0; i < id_list.length; i++) {
//        Arrays.stream(getReport.solution(id_list[i], report[i], k[i])).forEach(System.out::print);
//        System.out.println();
//        }