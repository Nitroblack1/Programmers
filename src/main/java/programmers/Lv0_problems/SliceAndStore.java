package programmers.Lv0_problems;


//        String my_str1 = "abc1Addfggg4556b";
//                int n1 = 6;
//
//                String my_str2 = "abcdef123";
//                int n2 = 3;
//
//                Arrays.stream(SliceAndStore.solution(my_str1, n1)).forEach(System.out::println);

public class SliceAndStore {
    public String[] solution(String my_str, int n) {
        int numberOfElements = (int)Math.ceil((double)my_str.length() / n);
        String[] answer = new String[numberOfElements];
        for(int i = 0; i < numberOfElements; i++) {
            if (i + 1 == numberOfElements) {
                answer[i] = my_str.substring(i*n);
                return answer;
            }
            answer[i] = my_str.substring(i*n, i*n+n);
        }
        return answer;
    }
}
