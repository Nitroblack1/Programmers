package programmers.Lv0_problems;

//        AdditionOfFraction additionOfFraction = new AdditionOfFraction();
//
//                int[] denum1 = {1,9,1};
//                int[] num1 = {2,2,2};
//                int[] denum2 = {3,1,1};
//                int[] num2 = {4,3,2};
//
//                for(int i = 0; i < denum1.length; i++) {
//        Arrays.stream(additionOfFraction.solution(denum1[i], num1[i], denum2[i], num2[i])).forEach(System.out::print);
//        System.out.println();
//        }
public class AdditionOfFraction {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int lCM = findLCM(num1, num2); // 6
        int finalDenum = (lCM / num1) * denum1 + (lCM / num2) * denum2; // 29 / 14
        int gCD = findGCD(finalDenum, lCM); // 2
        return new int[]{finalDenum / gCD, lCM / gCD};
    }

    private int findLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int common = 1;
        while(max*common % min != 0) {
            common++;
        }
        return max*common;
    }

    private int findGCD(int denum, int num) {
        int min = Math.min(denum, num);
        int max = Math.max(denum, num);
        int gCD = 1;
        for(int i = 1; i <= min; i++) {
            if(min % i == 0 && max % i == 0) {
                gCD = Math.max(i, gCD);
            }
        }
        return gCD;
    }
}

// 1/2 + 3/4 = 5/4
// 9/2 + 1/3 = 29/6


