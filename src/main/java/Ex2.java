public class Ex2 {
    public static boolean isBalanced(String expression) {
        SingleArrayStack stack = new SingleArrayStack(expression.length());

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "{[()]}";
        String exp2 = "{[(])}";
        String exp3 = "{{[[(())]]}}";

        System.out.println(exp1 + " is balanced: " + isBalanced(exp1));
        System.out.println(exp2 + " is balanced: " + isBalanced(exp2));
        System.out.println(exp3 + " is balanced: " + isBalanced(exp3));
    }
}
