/*
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь
*/

import java.util.Map;
import java.util.Stack;


public class ZD3 {
    public static void main(String[] args) {
        String str1 = "a+(d*3)";
        String str2 = "[a+(1*3)";
        String str3 = "[6+(3*3)]";
        String str4 = "{a}[+]{(d*3)}";
        String str5 = "<{a}+{(d*3)}>";
        String str6 = "{a+]}{(d*3)}";
        System.out.println();

        boolean res1;
        boolean res2;
        boolean res3;
        boolean res4;
        boolean res5;
        boolean res6;

        res1 = isParenthesesPlacement(str1);
        System.out.println(str1 + " - " + res1);

        res2 = isParenthesesPlacementMap(str2);
        System.out.println(str2 + " - " + res2);

        res3 = isParenthesesPlacementMap(str3);
        System.out.println(str3 + " - " + res3);

        res4 = isParenthesesPlacementMap(str4);
        System.out.println(str4 + " - " + res4);

        res5 = isParenthesesPlacementMap(str5);
        System.out.println(str5 + " - " + res5);

        res6 = isParenthesesPlacementMap(str6);
        System.out.println(str6 + " " + res6);
    }

    public static boolean isParenthesesPlacementMap(String str) {
        Stack<Character> placement = new Stack<>();
        Map<Character, Character> placements = Map.of('(', ')', '{', '}', '[', ']', '<', '>');

        for (int i = 0; i < str.length(); i++) {
            if (placement.isEmpty() && placements.containsValue(str.charAt(i))) {
                return false;
            }

            if (placements.containsKey(str.charAt(i))) {
                placement.add(placements.get(str.charAt(i)));
            } else if (!placement.empty() && placements.containsValue(str.charAt(i))) {
                if (placement.pop() == str.charAt(i)) {
                } else {
                    return false;
                }
            }
        }
        if (!placement.empty()) {
            return false;
        }
        return true;
    }

    public static boolean isParenthesesPlacement(String str) {
        Stack<Character> placement = new Stack<>();
        char[][] placements = {{'(', ')'}, {'{', '}'}, {'[', ']'}, {'<', '>'}};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < placements.length; j++) {
                if (placement.isEmpty() && str.charAt(i) == placements[j][1]) {
                    return false;
                }
                if (str.charAt(i) == placements[j][0]) {
                    placement.add(placements[j][1]);
                } else if (!placement.empty() && str.charAt(i) == placements[j][1]) {
                    if (placement.pop() == str.charAt(i)) {
                    } else {
                        return false;
                    }
                }
            }
        }
        if (!placement.empty()) {
            return false;
        }
        return true;
    }
}

