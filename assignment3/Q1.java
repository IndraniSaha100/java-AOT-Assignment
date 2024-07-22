package assignment3;
/**
 * 1. Write a java program to overload three methods named with addition() having different parameters
 * 
 * 2.Write a java program to overload the constructor named with Addition() having different parameters.
 * 
3. Overload the constructors for class Box for cube and cone and also display its volume.

4. [*] Repeat problem 3 for method overloading.

5. Create a class Student containing instance variables roll and name and a parameterized constructor. Create 
two objects of that class from the main class and print them (Hints: Override toString method of Object 
class).

*/

 class Student{
    int roll;
    String name;
    public Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    //override method tostring
    //inbuild toString method 
    //return getClass().getName() + "@" + Integer.toHexString(hashCode());

    public String toString(){
        return "Name of Student:"+name+" ,roll:"+roll;
    }
 }
class Addition{
    int result;
    //#2
    public Addition(int a,int b){
        result=a+b;
        System.out.println("Addition is done");
    }
    public Addition(int a,int b,int c){
        result=a+b+c;
        System.out.println("Addition is done");
    }
    public Addition(int a){
        result= a;
        System.out.println("Addition is done");
    }
    public Addition(){
       System.out.println("Without parameter, we can't add");
       result=-1;
    }

    //#1
    public int addition(int a,int b){
        return a+b;
    }
    public int addition(int a,int b,int c){
        return a+b+c;
    }
    public int addition(int a){
        return a;
    }
    public int addition(){
       System.out.println("Without parameter, we can't add");
        return -1;
    }
}
class Box{
    //#3
    public Box(float side){
        System.out.println("Volume of a cube is:"+(side*side*side));
    }
    final float pi=3.14f;
    public Box(float r,float h){
        System.out.println("Volume of a cone is:"+(pi*r*r*h)/3);
    }
}
public class Q1 {
    public static void main(String[] args) {
/*
        //#1 method overloading
        Addition add=new Addition();
        System.out.println("Add="+add.addition());
        System.out.println("Add="+add.addition(8,5));
        System.out.println("Add="+add.addition(90));
        System.out.println("Add="+add.addition(9,6,54));

        //#2 constructor overloading
        Addition add1=new Addition(4,6);
        Addition add2=new Addition(8);
        Addition add3=new Addition();
        Addition add4=new Addition(1,11,111);
        
        //#3
        Box box=new Box(2f);
        Box box1=new Box(3f,2);
        //#4
        // same as #1

        
        */
        //#5
        Student st=new Student(100,"indrani");
        System.out.println(st.toString());

        //#6
    }
}
