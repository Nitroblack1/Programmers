package programmers.Lv0_problems;

//        AgeInAlienPlanet ageInAlienPlanet = new AgeInAlienPlanet();
//
//                int[] ages = {23,51,100};
//                for(int age : ages) {
//                System.out.println(ageInAlienPlanet.solution(age));
//                }

public class AgeInAlienPlanet {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        for(String number : String.valueOf(age).split("")) {
            answer.append(ageSetter(number));
        }
        return answer.toString();
    }

    private String ageSetter(String number) {
        String ageSet = "0:a,1:b,2:c,3:d,4:e,5:f,6:g,7:h,8:i,9:j";
        for(String set : ageSet.split(",")) {
            if (set.contains(number)) {
                return set.split(":")[1];
            }
        }
        return "";
    }
}
