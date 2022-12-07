package programmers.Lv1_problems;

//        KnightsWeapon knightsWeapon = new KnightsWeapon();
//                int[] number = {5, 10};
//                int[] limit = {3,3};
//                int[] power = {2,2};
//
//                for(int i = 0; i < number.length; i++) {
//        System.out.println(knightsWeapon.solution(number[i], limit[i], power[i]));
//        }

public class KnightsWeapon {
    public int solution(int number, int limit, int power) {
        int powerOfKnight;
        int steel = 0;
        for(int numberOfKnight = 1; numberOfKnight <= number; numberOfKnight++) {
            powerOfKnight = 1;
            for(int powerDiagnoses = 1; powerDiagnoses <= numberOfKnight/2 ; powerDiagnoses++) {
                if (numberOfKnight % powerDiagnoses == 0) {
                    powerOfKnight++;
                }
            }
            if (powerOfKnight > limit) {
                steel += power;
            } else {
                steel += powerOfKnight;
            }
        }
        return steel;
    }
}
