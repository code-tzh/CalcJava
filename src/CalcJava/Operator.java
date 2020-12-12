package CalcJava;

public class Operator extends Exception {

    public Operator(String message) {
        super(message);
    }
    static int checkCalc(int first, int second, String operator)
    {
        if (first > 10 | second > 10) throw new NumberFormatException("Недопустим ввод числа больше 10");

        int endNum = 0;

        switch (operator) {
            case "+":
                endNum = first + second;
                break;
            case "-":
                if (second > first) throw new NumberFormatException("Второе значение должно быть меньше первого");
                endNum = first - second;
                break;
            case "*":
                endNum = first * second;
                break;
            case "/":
                if (second == 0) throw new NumberFormatException("Ошибка деления на ноль");
                endNum = first / second;
                break;
            default:
                return 0;
        }
        return endNum;
    }
}
