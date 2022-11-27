package programmers.Lv0_problems;

//int[] num = {29183, 232443, 123456};
//        int[] k = {1,4,7};
//        for(int i = 0; i < 3; i++) {
//        System.out.println(FindNumber.solution(num[i], k[i]));
//        }

public class FindNumber {
    public static int solution(int num, int k) {
        String[] numList = Integer.toString(num).split("");
        for(int i = 0; i < numList.length; i++) {
            if (Integer.parseInt(numList[i]) == k) {
                return i+1;
            }
        }
        return -1;
    }
}
