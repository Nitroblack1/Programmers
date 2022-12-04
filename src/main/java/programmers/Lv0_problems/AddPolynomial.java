package programmers.Lv0_problems;

//        AddPolynomial addPolynomial = new AddPolynomial();
//                String[] polynomials = {"3x + 7 + x", "x + x + x", "x"};
//
//                for(String polynomial : polynomials) {
//                System.out.println(addPolynomial.solution(polynomial));
//                }

public class AddPolynomial {

    public String solution(String polynomial) {
        int variables = 0;
        int constants = 0;
        if (polynomial.length() < 1) {
            return "";
        }
        String[] variableAndConstant = polynomial.split(" \\+ ");
        for (String variable : variableAndConstant) {
            if (variable.contains("x")) {
                if (variable.equals("x")) {
                    variables += 1;
                } else {
                    variables += Integer.parseInt(variable.split("x")[0]);
                }
            } else {
                constants += Integer.parseInt(variable);
            }
        }

        if (variables > 0 && constants > 0) {
            if (variables == 1) {
                return ("x" + " + " + constants);
            }
            return (variables + "x" + " + " + constants);
        }
        if (variables > 0 && constants == 0) {
            if (variables == 1) {
                return "x";
            }
            return (variables + "x");
        }
        if (variables == 0 && constants > 0) {
            return String.valueOf(constants);
        }
        return "";
    }
}
