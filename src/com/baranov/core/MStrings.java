package com.baranov.core;

public class MStrings {
    private static final String HEX_DIGITS = "0123456789ABCDEF";

    /*
    3.1
    напишите java-программу, чтобы получить символ в указанном индексе внутри строки.
    индекс указан конечным пользователем
    */
    public static char myCharAt(String value, int index) {
        if ((index < 0) || (index >= value.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value.toCharArray()[index];
    }

    /*
    3.2
    напишите java-программу, чтобы проверить, содержит ли указанная
    строка указанную последовательность значений char
    */
    public static boolean checkContainsSubstring(String main, String Substring) {
        assert main != null;

        if (Substring == null) {
            return false;
        }

        char fullstring[] = main.toCharArray();
        char sub[] = Substring.toCharArray();
        int counter = 0;
        if (sub.length == 0) {
            return true;
        }

        for (char aFullstring : fullstring) {
            if (aFullstring == sub[counter]) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter == sub.length) {
                return true;

            }

        }
        return false;
    }

    /*
    3.3
    напишите java-программу, которая вычисляет ваше начальное имя от ваше
    полного имени и отображает их
     */

    public static String initialFromName(String fName, String lName) {
        return MStrings.myCharAt(fName, 0) + "." + MStrings.myCharAt(lName, 0) + ".";
    }

    /*
    3.4
    реализовать java-программу, которая проверяет заданные строки,
    является ли она анаграммой другой
    */
    public static boolean checkIsAnAnagram(String s, String anagram) {
        if (s.length() != anagram.length()) return false;

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (MStrings.myCharAt(s, i) != ' ') {
                sum1 = sum1 + (int) MStrings.myCharAt(s, i);
            }

            if (MStrings.myCharAt(anagram, i) != ' ') {
                sum2 = sum2 + (int) MStrings.myCharAt(anagram, i);
            }
        }
        return sum1 == sum2;
    }

    /*
    3.5
    конвертировать шестнадцатеричные строки в их десятичное представление
    */
    public static int hexToD(String s) {

        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = MStrings.myCharAt(s, i);
            int d = HEX_DIGITS.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
}
