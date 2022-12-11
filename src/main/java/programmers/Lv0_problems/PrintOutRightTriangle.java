package programmers.Lv0_problems;

import java.util.Scanner;

public class PrintOutRightTriangle {
    public void solution(int n) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        for(int i = 1; i <= n; i++) {
            number = 1;
            while(number <= i) {
                System.out.print("*");
                number++;
            }
            System.out.println();
        }
    }
}
