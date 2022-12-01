package programmers.Lv0_problems;

import java.util.Objects;

//        LoginSuccess loginSuccess = new LoginSuccess();
//
//                String[] id_pw1 = {"meosseugi", "1234"};
//                String[] id_pw2 = {"programmer01", "15789"};
//                String[] id_pw3 = {"rabbit04", "98761"};
//                String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
//                String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
//                String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
//
//                System.out.println(loginSuccess.solution(id_pw1, db1));
//                System.out.println(loginSuccess.solution(id_pw2, db2));
//                System.out.println(loginSuccess.solution(id_pw3, db3));

public class LoginSuccess {
    public String solution(String[] id_pw, String[][] db) {
        for(String[] data : db) {
            if (Objects.equals(id_pw[0], data[0])) {
                if (Objects.equals(id_pw[1], data[1])) {
                    return "login";
                }
                return "wrong pw";
            }
        }
        return "fail";
    }
}
