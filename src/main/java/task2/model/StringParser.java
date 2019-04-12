package task2.model;

public class StringParser {

    private static int ID = 1;

    public static Item parseString(String expression) {
        return parseString(expression, 1);
    }

    public static int[] indexator(String expression) {
        int[] index = new int[expression.length()];
        int level = 1;
        for (int i=0; i<expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                index[i] = level++;
            } else if (expression.charAt(i) == ')') {
                index[i] = --level;
            }
            else {
                index[i] = 0;
            }
        }
        return index;
    }

    private static Item parseString(String expression, int level) {
        int[] index = indexator(expression);
        int i = 0;
        while (index[i] == 0 && i < expression.length()) i++;
        String s = expression.substring(0, i-1);
        System.out.println(s);
        int st = i++;
        while (index[i] != index[st]) i++;
        String subString = expression.substring(st+1, i);
        System.out.println(subString);

//        if (!expression.contains("("))
//            return new Product(level, expression);
//        else {
//            Box box = new Box(level);
//            String s = expression.substring(0, expression.indexOf('('));
//            if (!s.isEmpty()) {
//                box.add(new Product(level, expression.substring(0, expression.indexOf("("))));
//            }
//            expression = expression.substring(expression.indexOf("(")+1);
//            if (!expression.contains("(")) {
//                String ex = expression.substring(0, expression.indexOf(")"))
//            }
//        }
        return null;
    }

}
