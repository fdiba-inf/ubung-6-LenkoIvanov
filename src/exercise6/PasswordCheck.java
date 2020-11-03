package exercise6;

import java.util.Scanner;
import java.lang.Character; 
import java.util.Arrays;

public class PasswordCheck {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        boolean isValidLength;
        boolean isValidContent;

        do{
        System.out.println("Enter a password: ");
        String password = input.next();
        int passwordLength = password.length();

            if (passwordLength < 8) {
                isValidLength = false;
            } else {
                isValidLength = true;
            }

            char[] ch = password.toCharArray();
            int falseCounterOne = 0;
            int trueCounterTwo = 0;
            for (int i = 0; i < ch.length; i++) {
                if (!Character.isLetterOrDigit(ch[i])) {
                    falseCounterOne++;
                }
            }
            for (int i = 0; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    trueCounterTwo++;
                }
            }

            if (falseCounterOne > 1 || trueCounterTwo < 2) {
                isValidContent = false;
            } else {
                isValidContent = true;
            }


            if (isValidContent && isValidLength) {
                System.out.println("Password valid!");
            }
        }while(!isValidContent || !isValidLength);

    }
}
        
