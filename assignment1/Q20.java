/*
 20. Write a Java Program to check the perfect number.

 21. Write a Java Program to check Armstrong number.
 */
import java.util.Scanner;
class Perfect{
    // #20
    public boolean checkPerfect(int number){

        if(number==0)
            return false;

        int i=1;
        int count=1;
        int[] divisor=new int[number];
        while(i <= (number/2)){
            if(number%i==0){
                divisor[count++]=i;
            }
            i++;
        }

        int sum=0;
        for (int j : divisor) {
            sum+=j;
        }
        return sum==number;
    }
}
class Armstrong{
    // #21
    public int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public boolean checkArmstrong(int num){
        int temp=num;
        int count=digit(num);
        int[] cubeDigit=new int[count];

        int index=0;
        while(num>0){
            int value=num%10;
            cubeDigit[index++]=(int)Math.pow(value, count);
            num/=10;
        }
        int sum=0;
        for (int cd : cubeDigit) {
           sum+=cd; 
        }
        
        return sum==temp;
    }
}
public class Q20{
    public static void main(String[] args) {

        // #20
        Perfect obj=new Perfect();

        System.out.println("Enter number for checking perfect");
        Scanner inp=new Scanner(System.in);
        int number=inp.nextInt();
        if(obj.checkPerfect(number)){
            System.out.println("Number is perfect");
        }
        else
        System.out.println("Number is not perfect");


        // #21        
        System.out.println("Enter number for checking perfect");
        int num=inp.nextInt();

        Armstrong aObj=new Armstrong();
        if( aObj.checkArmstrong(num)){
            System.out.println("Number is Armstrong");
        }
        else
        System.out.println("Number is not Armstrong");
       
        inp.close();
    }
 }