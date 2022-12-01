package programmers.Lv0_problems;


//        ChickenCoupon chickenCoupon = new ChickenCoupon();
//                int[] testCases = {100, 1_081};
//                for(int testCase : testCases) {
//                System.out.println(chickenCoupon.solution(testCase));
//                }

public class ChickenCoupon {
    public int solution(int chicken) {
        int coupon = chicken;
        int serviceChicken = 0;
        while (coupon / 10 > 0) {
            serviceChicken += coupon / 10;
            coupon = coupon - (coupon / 10) * 9;
        }
        return serviceChicken;
    }
}