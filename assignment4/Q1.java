package assignment4;

import java.util.Scanner;

/**
 * 1. Check without having any abstract method/s whether a class can be abstract; if so, then use that concrete 
method/s from another class having the main method.

2. Write a Java Program to implement the following: 
 Create an abstract base class TwoD that contains two instance variable length and breadth and an abstract 
method area(). Three subclasses triangle, square and rectangle inherits the base class TwoD and override the 
method area() according to their shape. 

 */

abstract class TwoD{
    int length;
    int breadth;
    abstract public void area(Scanner sc);
}
class square extends TwoD
{
     //The issue you're encountering with the java.util.NoSuchElementException is likely due to the Scanner instance being closed after reading input in one of the methods and then attempting to read input again in another method using a new Scanner instance from the same input stream.

    /*error
    public int area(){
        System.out.println("Enter the side of square");
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        sc.close();
        return length*length;
    }*/
    public void area(Scanner sc){
        System.out.println("Enter the side of square");
        length=sc.nextInt();
        System.out.println("Area of square:"+length*length); 
    }
}
class rectangle extends TwoD
{
   
    public void area(Scanner sc){
        System.out.println("Enter the length of square");
        length=sc.nextInt();
        System.out.println("Enter the breadth of square");
        breadth=sc.nextInt();
        System.out.println("The area is :"+length*breadth);
    }

}
class triangle extends TwoD
{
    public void area(Scanner sc){
        System.out.println("Enter the length of base");
        length=sc.nextInt();
        System.out.println("Enter the breadth of height");
        breadth=sc.nextInt();
        System.out.println("The area is :"+(length*breadth)/2);
    }
}
abstract class Sample{

    //abstract class without having abstract method
    public void display(){
        System.out.println("I'm the concrete method of abstract class sample");
    }
}
class childSample extends Sample{

}
public class Q1 {
   public static void main(String[] args) {
    //#1
        Sample s1=new childSample();
        s1.display();

        //#2
        Scanner sc=new Scanner(System.in);
        TwoD t1=new square();
        t1.area(sc);
        t1=new rectangle();
        t1.area(sc);
        t1=new triangle();
        t1.area(sc);
        sc.close();
   } 
}
