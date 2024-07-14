/**
 
 26. Create a Java program that performs a fun mathematical operation using loops. Ask the user for a number and 
 then apply the following operation until the result becomes a single-digit number: Multiply each digit of the 
 number and repeat the process. Output each intermediate result. 
(Test Cases,
 I/P: 721 
 O/P: 
 Intermediate result: 14 
 Intermediate result: 4 
 Final result: 4 

I/P: 123 
O/P: 
Intermediate result: 6 
Final result: 6).

 27. Write a function that returns the second last digit of the given number. (For example, if the given number is 197, the second last digit is 9)

Note1 - The second last digit should be returned as a positive number, i.e. if the given number is -197, the 
second last digit is 9. 
Note2 - If the given number is a single digit number, then the second last digit does not exist. In such cases, 
the function should return -1.) 

 
 */
import java.util.Scanner;
class SecondLastDigit{
    // #27
    public int secondLastDigit(int num){
        num%=100;
        int value=num/10;
        if(value<0){
            return -value;
        }
        if(value==0){
            return -1;
        }
        return value;
    }
}
public class Q26 {
    public static void main(String[] args) {

        // #26
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number for fun");
        int number=inp.nextInt();
        
        while(number>9){
            int[] tempArray=new int[10];
            int ind=0;
            while(number>0){
                tempArray[ind++]=number%10;
                number/=10;
            }
            int mul=1;
            for(int i=0;i<ind;i++){
                mul*=tempArray[i];
            }
            System.out.println("Intermediate result:"+mul);
            number=mul;
        }
        System.out.println("Final result:"+number);
        
        // #27
        //#27
        System.out.println("Enter the number");
        int num=inp.nextInt();
        
        SecondLastDigit sd=new SecondLastDigit();
        System.out.println("The second last digit is "+sd.secondLastDigit(num));
        
        inp.close();
    }
}
