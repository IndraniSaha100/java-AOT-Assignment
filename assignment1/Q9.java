/* 9.Write a Java Program to check Leap Year.

 10. Write a Java Program to multiply a number by 2 and divide the same number by 4 using shift operator. 

 11. Write a Java Program to swap two numbers using the bitwise operator.

 12. Write a program to calculate the Simple Interest (si) while your inputs are principle (p), time in years (n) and rate of interest (r). 

 13. a) Write a Java Program to convert long to int.
 b) Write a Java Program to find the ASCII value of a Character. 

 14. Write a java program to take an integer input from the user and print its reverse.
 */

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {

        // #9
        Scanner inp=new Scanner(System.in);
        int year;
        System.out.println("Enter year ");
        year=inp.nextInt();
        if(year % 4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Leap year..");
                }
                else
                    System.out.println("Not Leap year");
            }
            else
                System.out.println("Leap year..");
            }
        else 
            System.out.println("Not Leap year..");
          
            // #10
            System.out.println("Enetr the input ");
            int x=inp.nextInt();
            System.out.println("After multiplying by 2 using shift operator is "+(x<<1));
            System.out.println("After dividing by 4 using shift operator is "+(x>>2));

            
            // #11
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the two number for swapping");
            //If i want to use the same inp two times 
            // System.out.println("The left over:"+inp.nextLine());
            // String str=int.nextLine();//it can take the output without throwing numberFormatException
            String str=input.nextLine();
            String[] parts=str.split(" ");
            int first=Integer.parseInt(parts[0]);
            int second=Integer.parseInt(parts[1]);

            //for swapping, do the following operation
            System.out.println("Before swapping numbers are "+first+" , "+second);
            first = first^second;
            second = first^second;//second hold the value of first
            first = first^second;//first hold the value of second
            System.out.println("After swapping numbers are "+first+" , "+second);

            // #12
            System.out.println("Enter principle");
            int p=inp.nextInt();
            System.out.println("Enter time in year");
            int n=inp.nextInt();
            System.out.println("Enter rate");
            int r=inp.nextInt();

            float interest=(p*n*r)/100;
            System.out.println("Interest is "+interest);

            // #13
            long l=2344456244999990001l;
        System.out.println("conversion of long to int:"+((int)l));

            char c='5';
        System.out.println("ASCII value of a character:"+((int)c));

            // #14
            System.out.println("Enter a number for reversing");
            int userInput=inp.nextInt();
            int reverseInput=0;
            while(userInput!=0){
                reverseInput=reverseInput*10+(userInput%10);
                userInput=(userInput/10);
            }
            System.out.println("The reverse number is "+reverseInput);
            

        inp.close();
        input.close();
    }
    
}
