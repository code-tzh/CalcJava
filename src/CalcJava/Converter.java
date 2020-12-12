package CalcJava;

public class Converter {
    private static int[] numbers = { 1, 4, 5, 9, 10, 40, 50, 90, 100};
    private static String[] letters = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};

    static int getNumRoman(String romanValue) throws NumberFormatException {
        int intValue = 0;
        int prev = 0;

        for (int i = 0; i < romanValue.length(); i++) {
            char ch = romanValue.charAt(i);

            int numRom = getNumLetter(ch);
            if (numRom == -1) throw new NumberFormatException("Введены некорректные данные");
            if (prev > 0 & prev < numRom) numRom -= prev + 1;

            intValue += numRom;
            prev = numRom;
        }
        return intValue;
    }

    private static int getNumLetter (char letter) {

        switch (letter) {
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
            default :  return 0;
        }
    }

    static String getRoman(int number) throws NumberFormatException {

        if (number == 0) throw new NumberFormatException("Дожно быть число от I до X включительно");
        String romanValue = "";
        int num = number;

        while (num > 0) {
            for (int i = 0; i < numbers.length; i++) {
                if (num < numbers[i]) {
                    num -= numbers[i - 1];
                    romanValue += letters[i - 1];
                    break;
                }
            }
        }
        return romanValue;
    }
}
