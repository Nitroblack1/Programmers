package programmers.Lv1_problems;

//        CalcInsufficientMoney calcInsufficientMoney = new CalcInsufficientMoney();
//
//                System.out.println(calcInsufficientMoney.solution(3, 20, 4));

public class CalcInsufficientMoney {
    public long solution(int price, int money, int count) {
        long calcNum = 0;
        for(int i = 1; i <= count; i++) {
            calcNum += i;
        }
        if ((long)price * calcNum < money) {
            return 0;
        }
        return (long) price * calcNum - money;
    }
}
