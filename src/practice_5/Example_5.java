package practice_5;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expressions like: 1.2+3.4 2.4*4.5: ");

        String input = scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");

        while (tokenizer.hasMoreTokens()) {
            String problem = tokenizer.nextToken();
            if (!problem.isEmpty()) {
                solveProblem(problem);
            }
        }
    }

    public static void solveProblem(String problem) {
        double leftOperand = 0, rightOperand = 0, result = 0;
        String operator = "";
        StringTokenizer tokenizer = new StringTokenizer(problem, "+-*/", true);

        try {
            leftOperand = Double.parseDouble(tokenizer.nextToken());
            operator = tokenizer.nextToken();
            rightOperand = Double.parseDouble(tokenizer.nextToken());

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
                    if (rightOperand == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    result = leftOperand / rightOperand;
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
                    return;
            }

            System.out.println("Result of " + problem + " = " + result);
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Invalid syntax in expression: " + problem);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("One or more operands is not a number in expression: " + problem);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Error in expression " + problem + ": " + arithmeticException);
        }
    }
}
