/*
5.Write a program to convert the given temperature in Fahrenheit to Celsius using the following formula: 
C /5 = (F-32)/9.

6. Write a Java Program to add two Numbers. (By Keyboard Input or Command Line Input).

7. Write a Java Program to demonstrate arithmetic operations between two numbers using command line arguments.

8. Write a Java Program to check if a number is Even or Odd */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
      //#5
    
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter farenheit value ");
        float f=inp.nextFloat();
        float c=5*((f-32)/9);
        System.out.println("The farenheit "+f+" to celcious "+c);
        inp.close();


        // #6,#7

        if(args.length<2){
            System.out.println("provide me the command line input of two integer");
        }  
        else{
            int first=Integer.parseInt(args[0]);
            int second=Integer.parseInt(args[1]);
            
            System.out.println("The addition of "+first+" and "+second+ " is "+(first +second));
            System.out.println("The subtraction of "+first+" and "+second+ " is "+(first -second));
            System.out.println("The multiplication of "+first+" and "+second+ " is "+(first *second));
            System.out.println("The division of "+first+" and "+second+ " is "+(first /second));
            System.out.println("The remainder of "+first+" and "+second+ " is "+(first%second));
        }

        // #8
        int num=39;
        if(num %2==0){
            System.out.println("The number is even..");
        }
        else{
            System.out.println("The number is odd..");

        }   
    }
}
