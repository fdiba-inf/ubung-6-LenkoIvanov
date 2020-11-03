package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        int rest = 0;

        boolean isPalindrome = true;

        while(number != 0){
          rest = number % 10;
          reversedNumber = (reversedNumber * 10) + rest;
          number = number / 10;
        }
        
        if(reversedNumber == originalNumber){
          System.out.print("Palindrome: " + isPalindrome);
        }
        else{
          isPalindrome = false;
          System.out.print("Palindrome: " + isPalindrome);
        }
    }
}
