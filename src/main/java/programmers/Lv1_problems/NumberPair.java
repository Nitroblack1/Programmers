package programmers.Lv1_problems;

//        NumberPair numberPair = new NumberPair();
//
//
//                String[] X = {"100", "100", "100", "12321", "5525"};
//                String[] Y = {"2345", "203045", "123450", "42531", "1255"};
//
//                for(int i = 0; i < X.length; i++) {
//        System.out.println(numberPair.solution(X[i], Y[i]));
//        }

public class NumberPair {
    public String solution(String X, String Y) {
        int[] xArray = new int[10];
        int[] yArray = new int[10];
        int[] answerArray = new int[10];
        StringBuilder answer = new StringBuilder();
        for(String x : X.split("")) {
            xArray[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")) {
            yArray[Integer.parseInt(y)]++;
        }
        for(int i = 0; i < 10; i++) {
            if(xArray[i] > 0 && yArray[i] > 0) {
                answerArray[i] = (Math.min(xArray[i], yArray[i]));
            }
        }
        for(int i = 9; i >= 0; i--) {
            if(answerArray[i] != 0) {
                for(int j = 0; j < answerArray[i]; j++) {
                    answer.append(i);
                }
            }
        }
        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.indexOf("0") == 0) {
            return "0";
        }
        return answer.toString();
    }
}

// 0123456789
// 2100000000
// 0011110000
// 21

// 0123456789
// 2100000000
// 2011110000
// 2000000000

// 0010030000
// 0110020000
// 0010020000