package programmers.Lv1_problems;

import java.util.Objects;

//        MakeHamburger makeHamburger = new MakeHamburger();
//
//                int[][] ingredients = {{2,1,1,2,3,1,2,3,1}, {1,3,2,1,2,1,3,1,2}, {1,2,3,1,1,2,3,1}};
//
//                for(int[] ingredient : ingredients) {
//                System.out.println(makeHamburger.solution(ingredient));
//                }

public class MakeHamburger {

    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder wrap = new StringBuilder();
        if (ingredient.length < 4) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < ingredient.length; i++) {
            wrap.append(ingredient[i]);
            if (wrap.length() >= 4 && Objects.equals(wrap.substring(index - 3, index + 1), "1231")) {
                wrap.delete(index - 3, index + 1);
                answer++;
                index -= 4;
            }
            index++;
        }
        return answer;
    }
}

// 빵 : 1
// 야채 : 2
// 고기 : 3