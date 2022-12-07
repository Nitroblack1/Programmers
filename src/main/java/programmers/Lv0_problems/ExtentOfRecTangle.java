package programmers.Lv0_problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//        ExtentOfRecTangle extentOfRecTangle = new ExtentOfRecTangle();
//
//                int[][] case1 = {{1,1}, {2,1}, {2,2}, {1,2}};
//                int[][] case2 = {{-1,-1}, {1,1}, {1,-1}, {-1,1}};
//
//                System.out.println(extentOfRecTangle.solution(case1));
//                System.out.println(extentOfRecTangle.solution(case2));

public class ExtentOfRecTangle {
    public int solution (int[][] dots) {
        List<Integer> xAxis = new ArrayList<>();
        List<Integer> yAxis = new ArrayList<>();
        for(int[] dot : dots) {
            xAxis.add(dot[0]);
            yAxis.add(dot[1]);
        }
        xAxis.sort(Comparator.naturalOrder());
        yAxis.sort(Comparator.naturalOrder());
        return (xAxis.get(0) - xAxis.get(3)) * (yAxis.get(0) - yAxis.get(3));
    }
}
