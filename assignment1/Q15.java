/*
 15. Write a java program to print Fibonacci series. 

16. Write a java program to print the nth Fibonacci number. (n must be taken as an input).

17. Write a Java Program to find Sum of n-natural numbers.

18. Write a Java Program to check palindrome numbers.

19. Write a Java Program to display prime numbers from 1 to n.

 */
import java.util.Scanner;;
class Fibonacci{
    public int[] table=new int[100];//Must initialize else have nullPointer Exception 
    
    // #15
    public void printSeries(int number){//number is the value of  total elements of the series
        int firstTerm=0;
        int secondTerm=1;
        while(number>0){
            
            System.out.print(firstTerm+" ");
            int x=secondTerm;
            secondTerm=firstTerm;
            firstTerm=secondTerm+x;
            number--;
        }
        System.out.println();
    }

    // #16
    public int nthSeries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        table[0]=0;table[1]=1;
        for(int i=2;i<n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        return table[n-1];
    } 
}
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
}
class Prime{
    private boolean checkPrime(int userInput){
        if(userInput==1)
            return false;
        if(userInput==2)
            return true;
        if(userInput%2==0)
            return false;
        for(int i=3;i<userInput;i+=2){
            if(userInput%i==0)
                return false;
        }
        return true;
    }
    public void displayPrime(int n){
        for(int i=1;i<=n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
public class Q15 {
    public static void main(String[] args) {
        Fibonacci f1=new Fibonacci();

        Scanner inp=new Scanner(System.in);

        // #15
        System.out.print("Enter the total number of element present in the fibonacci series:");
        int number=inp.nextInt();
        f1.printSeries(number);
        
        // #16
        System.out.println("Enter the nth value");
        int n=inp.nextInt();
        System.out.println("The "+n+"th fibonacci number is "+f1.nthSeries(n));

        //#17
        //sum of n natural number=   (n*(n+1))/2
        System.out.println("Enter natural number");
        int naturalNumber=inp.nextInt();
        float sum= (naturalNumber*(naturalNumber+1))/2;
        System.out.println("The Sum of n-natural numbers :"+sum);


        // #18
        System.out.println("Enter a number for checking palindrome");
        int num=inp.nextInt();

        Palindrome p1=new Palindrome();
        if(p1.checkPalindrome(num)){
            System.out.println("The number "+num+" is palindrome");
        }
        else
            System.out.println("The number "+num+" is not palindrome");


        //#19 
        System.out.println("Enter n, to see prime numbers between 1 to n");
        int input=inp.nextInt();

        Prime primeObj=new Prime();
        System.out.println("The numbers are");
        primeObj.displayPrime(input);


        inp.close();
    }
}
