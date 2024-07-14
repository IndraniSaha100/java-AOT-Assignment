/*

29. Write a java program for reverse the digits of a given number and add it to the original number until a 
palindrome is obtained. 
Also provide all intermediate results.
(Test Cases, I/P: 174 
O/P: Intermediate result: 645
 Intermediate result: 1191
 Intermediate result: 3102
 Intermediate result: 5115
 Final result: 5115
I/P: 123 
O/P: Intermediate result: 444
 Final result: 444).

30. Write a java program to print Collatz Sequence.
 (If number is even, then n = n / 2, If number is odd, then n = 3×n + 1. Repeat, until it becomes 1).
(Test Cases, I/P: 3 O/P: 3, 10, 5, 16, 8, 4, 2, 1
 I/P: 6 O/P: 6, 3, 10, 5, 16, 8, 4, 2, 1
I/P: -6 O/P: ERROR ).

31. Write a java program that simulates a basic number guessing game. The computer randomly selects a target 
number between 1 and 100, and the player has to guess the correct number within a limited number of attempts.
 */

import java.util.Scanner;
import java.util.Random;

class Palindrome{
    private int reverseNummber(int userInput){
        int reverseInput=0;
            while(userInput!=0){
                reverseInput=reverseInput*10+(userInput%10);
                userInput=(userInput/10);
            }
        return reverseInput;
    }
    // #18
    public boolean checkPalindrome(int userInput){
        int reverseInput=reverseNummber(userInput);
        if(reverseInput==userInput)
            return true;
        else
            return false;
    }
    //#29
    public void makePalindrome(int num){
        if(checkPalindrome(num))
        {
            System.out.println("Final result:"+num);
            return;
        }
        int reverseNum=reverseNummber(num);
        num+=reverseNum;
        while (!checkPalindrome(num)) {
            System.out.println("Intermediate result:"+num);
            reverseNum=reverseNummber(num);
            num+=reverseNum;            
        }
        System.out.println("Final result:"+num);
    }
}

public class Q29 {
    
    public static void main(String[] args) {
        
    Scanner inp=new Scanner(System.in);
    
    //#29
    System.out.println("Enter the number for making it palindrome");
    int number=inp.nextInt();
    Palindrome p1=new Palindrome();
    p1.makePalindrome(number);

    // #30
    System.out.println("Enter number:");
    int n=inp.nextInt();

    if(n<0){
        System.out.println("Error");
    }
    else{
        while(n!=1){
            System.out.print(n+" ");
            if(n%2==0)
            n/=2;
            else        n=3*n+1;
        }
        System.out.print(1);
    }


    // #31
    // int computer=(int)(Math.random()*100+1);
    Random rand= new Random();
    int computer=rand.nextInt(100)+1;
    String s="Start";
    int attempt=1;
    System.out.println("\nEnter number between 1 to 100");
    do {
        int guess=inp.nextInt();
        if(guess>computer){
            System.out.println("Enter the smaller number");
        }
        else if(guess<computer){
            System.out.println("Enter the larger number");
        }
        else{
            System.out.println("Hurrah you guess right!! at "+attempt+" attempts");
            s="Quit";
        }
        attempt++;
    } while (s!="Quit");
    
    inp.close();
    }
}
