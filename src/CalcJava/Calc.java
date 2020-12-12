package CalcJava;

public class Calc {
    static boolean checkNum (String numStr) {

        if (numStr == null || numStr.isEmpty()) return false;
        for (int i = 0; i < numStr.length(); i++) if (!Character.isDigit(numStr.charAt(i))) return false;
        return true;
    }

    static boolean checkOperator(String operatorStr) {
        if (operatorStr == null || operatorStr.isEmpty()) return false;

        switch (operatorStr) {
            case "/":
            case "*":
            case "+":
            case "-":
                return true;

            default : return false;
        }
    }
}
