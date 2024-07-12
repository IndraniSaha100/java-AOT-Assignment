/*
1.Write a program to print your name.

2. Write a Java Program to print your college name by taking input through command line arguments.

3. Write a Java Program to take two inputs (name and college name) through command line argument and 
print as follows:
<name> is a BTECH student of <college name> college.
(e.g.: Input: Ram AOT
Output: Ram is a BTECH student of AOT college)

4. Write a program to read the price of an item in the decimal form (like 175.95) and print the output in paise 
(like 17595 paise).*/

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        // #1
        System.out.println("Indrani Saha");
        //#2
        Scanner inp=new Scanner(System.in);
        String clgName=inp.nextLine();
        System.out.println("College name="+clgName);
        
        // #3
        String combinedInput=inp.nextLine();

        String[] parts=combinedInput.split(" ");

        System.out.println(parts[0]+ " is a BTECH student of "+parts[1]+" college.");
        

        // #4
        float price=inp.nextFloat();
        int paise= (int) (price*100); 
        System.out.println("The price is "+paise);
        inp.close();
    }
}