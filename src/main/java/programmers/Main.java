package programmers;

import programmers.Lv1_problems.solving.NumberPair;

public class Main {

    public static void main(String[] args) {
        NumberPair numberPair = new NumberPair();


        String[] X = {"100", "100", "100", "12321", "5525"};
        String[] Y = {"2345", "203045", "123450", "42531", "1255"};

        for(int i = 0; i < X.length; i++) {
            System.out.println(numberPair.solution(X[i], Y[i]));
        }
    }
}


