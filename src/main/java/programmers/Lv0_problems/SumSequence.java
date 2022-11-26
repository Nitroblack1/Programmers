package programmers.Lv0_problems;

//int[] case1 = {3, 12};
//        int[] case2 = {5, 15};
//        System.out.println(Arrays.toString(SumSequence.solution(4, 14)));

public class SumSequence {

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num % 2 == 1) {
            int standardIndex = num / 2;
            int standard = total / num;
            for (int i = 0; i * 2 < num; i++) {
                answer[standardIndex + i] = standard + i;
                answer[standardIndex - i] = standard - i;
            }
        } else {
            int standardL = total / num; // 3
            int standardR = (total / num) + 1; // 4
            int standardIndex = num / 2; // 2
            for (int i = 0; i * 2 < num; i++) {
                answer[standardIndex - i - 1] = standardL - i;
                answer[standardIndex + i] = standardR + i;
            }
        }
        return answer;
    }
}
