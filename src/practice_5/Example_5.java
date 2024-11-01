package practice_5;

import java.util.*;

public class Example_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter like 1.2+3.4 2.4*4.5");
        String soz = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(soz," +-*/",true);

        double                 leftOperand, result = 0, rightOperand;
        String                 leftString, operator, rightString;
        double                 leftOperand1, result1 = 0, rightOperand1;
        String                 leftString1, operator1, rightString1;






        try
        {
            leftString   = tokenizer.nextToken();
            operator     = tokenizer.nextToken();
            rightString  = tokenizer.nextToken();

            leftString1   = tokenizer.nextToken();
            operator1     = tokenizer.nextToken();
            rightString1  = tokenizer.nextToken();


            leftOperand  = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString);
            leftOperand1  = Double.parseDouble(leftString);
            rightOperand1 = Double.parseDouble(rightString);

            if (operator.equals("+") )
                result = leftOperand + rightOperand;
            else if(operator.equals("-") ){
                result = leftOperand - rightOperand;
            } else if (operator.equals("*") ) {
                result = leftOperand * rightOperand;


            } else if (operator.equals("/") ) {
                result = leftOperand / rightOperand;

            }
            if (operator1.equals("+") )
                result1 = leftOperand1 + rightOperand1;
            else if(operator1.equals("-") ){
                result1 = leftOperand1 - rightOperand1;
            } else if (operator1.equals("*") ) {
                result1 = leftOperand1 * rightOperand1;


            } else if (operator1.equals("/") ) {
                result1 = leftOperand1 / rightOperand1;

            } else
                result1 = 0.0;


            System.out.println("Result: " + result + " result 2:" + result1);
        }
        catch (NoSuchElementException nsee)
        {
            System.out.println("Invalid syntax");
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("One or more operands is not a number");
        }


    }
}
