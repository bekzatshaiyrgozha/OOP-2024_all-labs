package practice_5;

import java.util.*;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expressions like: 1.2+3.4 2.4*4.5: ");
        String input = in.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ", true);

        while (tokenizer.hasMoreTokens()) {
            String expression = tokenizer.nextToken();
            if (!expression.isEmpty()) {
                evaluateExpression(expression);
            }
        }
    }

    private static void evaluateExpression(String expression) {
        double leftOperand = 0, rightOperand = 0, result = 0;
        String operator = "";
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

        try {
            leftOperand = Double.parseDouble(tokenizer.nextToken().trim());
            operator = tokenizer.nextToken().trim();
            rightOperand = Double.parseDouble(tokenizer.nextToken().trim());

            switch (operator) {
                case "+":
                    result = leftOperand + rightOperand;
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    break;
                case "/":
                    if (rightOperand == 0) throw new ArithmeticException("Division by zero");
                    result = leftOperand / rightOperand;
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    return;
            }

            System.out.println("Result of " + expression + " = " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression: " + expression);
        } catch (NumberFormatException nfe) {
            System.out.println("One or more operands is not a number in expression: " + expression);
        } catch (ArithmeticException ae) {
            System.out.println("Error in expression " + expression + ": " + ae.getMessage());
        }
    }
}
