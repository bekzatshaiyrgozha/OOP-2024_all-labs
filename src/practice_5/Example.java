package practice_5;

import java.util.StringTokenizer;

public class Example {
    public static void main(String[] args) {
        String text = "2.5+3.4 4.2*6.1";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}