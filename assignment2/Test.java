package assignment2;

import java.util.Scanner;

/*
 * 1. Create a class Test, make instance variable [int x], method [void show()] and also put main method inside that class and use the instance variable and method from main.
 * 
2. Create a class Test1, make instance variables [int x], method [void show()] and use them from main, declared in different classes.

3. Create a class; put a method inside this class which will return a class reference of the same class and/or different 
class object.

4. Write a JAVA Program to create a Student class with proper attributes like roll no, name, stream, and college. 
Create two instances of that class from main (declared in different classes) and print them.

5. Design a class to represent a Bank Account. Include the following things: 
Fields
    Name of the depositor
    Account number
    Type of account
    Balance amount in the account 
Methods
    To assign initial values
 To deposit an amount
 To withdraw an amount after checking balance
 To display the name and balance
    From main (declared in different classes) access them. 
 */
class BankOfIndrani{
    String name;
    long accNo;
    String accountType="";
    private int balance=0;
    public BankOfIndrani(String name, long accNo, String accountType) {
        this.name = name;
        this.accNo = accNo;
        this.accountType = accountType;
    }
    public BankOfIndrani() {
    }
    public void assignInitialValue(String name, long accNo, String accountType) {
        this.name = name;
        this.accNo = accNo;
        this.accountType = accountType;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(){
        System.out.println("Withdraw the amount based on blance:  "+balance);
        Scanner sc= new Scanner(System.in);
        int amount=sc.nextInt();
        if(balance==0 || balance-amount<0){
            System.out.println("You can't withdraw,balance goes to 0");
            sc.close();
            return;
        }
        balance-=amount;
        sc.close();
    }
    public void checkBalance(){
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
    }
    
}
class Student{
    int roll;
    String name;
    static final String clg="AOT";
    String stream;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStream() {
        return stream;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
    
}



class Test1{
    int instance=98;
    static float pi=3.14f;
    public void show (){
        System.out.println("I'm the method of another class Test1..");
    }
    //#3
    public Test throwReference(){
        return new Test(); 
    }
}
public class Test {
    //for compile and run
    //PS D:\javaProgram\java-AOT-lab-training> javac assignment2/Test.java
   // PS D:\javaProgram\java-AOT-lab-training> java assignment2.Test  

    int instance=78;
    static float pi=3.14f;
    public void show (){
        System.out.println("I'm the simbling of main method of my mother Test class..");
    }
    public static void main(String[] args) {

        //#1
        Test t1=new Test();
        System.out.println("The same class instance variable is "+t1.instance);
        System.out.println("The same class static instance variable is "+Test.pi);
        t1.show();
        
        //#2
        Test1 t2=new Test1();
        System.out.println("different class instance variable is "+t2.instance);
        System.out.println("different class static instance variable is "+Test1.pi);
        t2.show();

        //#3
        Test x=t2.throwReference();
        x.show();

        //#4
        Student s1= new Student();
        Student s2= new Student();
        s1.name="Indrani Saha";
        s1.roll=100;
        s1.stream="CSE2";

        s2.setName("Arunima");
        s2.setRoll(79);
        s2.setStream("CSE2");
        System.out.println("clg name="+Student.clg);
        System.out.println("student name="+s1.getName());
        System.out.println("student name="+s2.getName());

        //#5
        BankOfIndrani person1=new BankOfIndrani();
        //by constructor
        //BankOfIndrani person2=new BankOfIndrani("indrani",9721288,"regular");

        //by method
        // person1.assignInitialValue("indrani",66746460, "salary");

        person1.name="indrani";
        person1.accNo=2098216678;
        person1.accountType="salary";
        
        System.out.println("Enter the amount to deposit:");
        Scanner data=new Scanner(System.in);
        int amount=data.nextInt();

        person1.deposit(amount);
        person1.checkBalance();
        person1.withdraw();
        person1.checkBalance();
        data.close();
    }
}
