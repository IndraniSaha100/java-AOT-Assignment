package assignment3;
/**
 * 6. Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance 
variable no_of_publication and experience. Now create its subclass, say Dscientist which has an instance
variable award. Put a method: public String toString () { } in every class where you describe about the class 
and from the main create object of each class and print each object.

7. Create a class with a method void show () and make 3 subclasses of it and all subclasses have void show () 
method overridden and call those methods using their class references.

8. [*] Do the problem 6 using dynamic method dispatching.
 */
class Q7{
    public void show(){
        System.out.println("It is a show method of Q7");
    }
}
class Q7Child extends Q7{
    public void show(){
        System.out.println("It is a show method of Q7-child");
    }
}
class Q7ChildChild extends Q7Child{
    public void show(){
        System.out.println("It is a show method of Q7-child-child");
    }
}
class EMP{
    String name="Indrani";
    String id="indrani100";
    @Override
    public String toString() {
        return "EMP [name=" + name + ", id=" + id + ", getClass()=" + getClass() + "]";
    }
    
}
class Scientist extends EMP{
    int no_of_publication=10;
    int experience=20;
    @Override
    public String toString() {
        return "Scientist [no_of_publication=" + no_of_publication + ", experience=" + experience + ", getClass()="
                + getClass() + "]";
    }
}
class DScientist extends EMP{
    String award="Best Student";

    @Override
    public String toString() {
        return "DScientist [award=" + award + ", getClass()=" + getClass() + "]";
    }
}
public class Q6 {
    public static void main(String[] args) {
        //#6 examples of method overriding
        EMP e11=new EMP();
        System.out.println(e11.toString()+"\n");

        Scientist e2=new Scientist();
        System.out.println(e2.toString()+"\n");

        DScientist e3=new DScientist();
        System.out.println(e3.toString()+"\n");
        
        //#7
        Q7 obj=new Q7();
        obj.show();

        obj=new Q7Child();
        obj.show();

        obj=new Q7ChildChild();
        obj.show();

        //#8 method overriding using dynamic dispatch method
        EMP e1=new EMP();
        System.out.println(e1.toString()+"\n");
        
        e1=new Scientist();
        System.out.println(e1.toString()+"\n");

        e1=new DScientist();
        System.out.println(e1.toString()+"\n");
    }
}
