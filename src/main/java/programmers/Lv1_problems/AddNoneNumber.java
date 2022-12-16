package programmers.Lv1_problems;

//        AddNoneNumber addNoneNumber = new AddNoneNumber();
//
//                int[][] numberses = {{1,2,3,4,6,7,8,0}, {5,8,4,0,6,7,9}};
//
//                for(int[] numbers : numberses) {
//                System.out.println(addNoneNumber.solution(numbers));
//                }

public class AddNoneNumber {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int element : numbers) {
            answer -= element;
        }
        return answer;
    }
}
