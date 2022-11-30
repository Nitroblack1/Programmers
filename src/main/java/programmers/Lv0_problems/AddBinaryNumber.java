package programmers.Lv0_problems;

import java.math.BigInteger;

//        AddBinaryNumber addBinaryNumber = new AddBinaryNumber();
//
//                String[] testCase = {"10", "1001", "11", "1111"};
//                for(int i = 0; i < 2; i++) {
//        System.out.println(addBinaryNumber.solution(testCase[i], testCase[i + 2]));
//        }

public class AddBinaryNumber {

    public String solution(String bin1, String bin2) {
        BigInteger bin1Binary = new BigInteger(bin1, 2);
        BigInteger bin2Binary = new BigInteger(bin2, 2);
        BigInteger sum = bin1Binary.add(bin2Binary);
        Integer.parseInt(bin1);
        return sum.toString(2);
    }
}
