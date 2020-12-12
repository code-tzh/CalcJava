package CalcJava;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа от 1 до 10 (или от I до X включительно) \nи знак операции + - * / \nПробелы между знаками обязательны.");
        System.out.println("Программа принимает как арабские и римские цифры в одном выражении.");

        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        String[] values = inputValue.split(" "); //задаем порядок операции в строке
        String firstValue  = "";
        String operator  = "";
        String secondValue = "";

        try
        {    firstValue  = values[0];
            operator  = values[1];
            secondValue = values[2];
        }

        catch (Exception e)  //обрабатываем ошибку
        {
            System.out.println("Некорректный формат операции");
            return; }

        try //другие исключения
        {   if (!Calc.checkOperator(operator)) throw new Operator("Введены некорректные значения");

            if (Calc.checkNum(firstValue) & Calc.checkNum(secondValue))
            {
                int endNum = Operator.checkCalc(Integer.parseInt(firstValue),
                        Integer.parseInt(secondValue), operator);

                System.out.print(endNum);

            } else {

                int first = Converter.getNumRoman(firstValue);
                int second = Converter.getNumRoman(secondValue);
                int endNum = Operator.checkCalc(first, second, operator);

                String romanNum = Converter.getRoman(endNum);

                System.out.print(romanNum);

            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
