package assignment4;
/**
 * 
3. Write a Java Program to create a base class Animal having properties: consume food, capable of motion. 
Two subclass Mammal and Reptile having features: covered with hairs and feed breast milk to its infants, can 
crawl have scales and cold blooded respectively. 
Show the properties of Human and cow for Mammal category, snake and crocodile for reptile category 
adding one new feature for each of the classes.
 */
abstract class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
    public void consumeFood(){
        System.out.println(getName()+" Consumes food");
    }
    public void capableOfMotion(){
        System.out.println(getName()+" is capable of motion");
    }
   public String getName() {
        return name;
    }
    abstract public void feature();
}
abstract class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    public void coveredWithHair(){
        System.out.println(getName()+" is covered with hair");
    }
    public void feedBreastMilk(){
        System.out.println(getName()+" feed breast milk to infants");
    }
    
}
abstract class Reptile extends Animal{
    public Reptile(String name){
        super(name);
    }
    public void canCrawl(){
        System.out.println(getName()+" can crawl");
    }
    public void haveScales(){
        System.out.println(getName()+" have scales");
    }
    public void coldBlooded(){
        System.out.println(getName()+" is cold blodded animal");
    } 
}
class Human extends Mammal{
    public Human(){
        super("Human");
    }
    public void opposableThumb(){
        System.out.println(getName()+" have opposable thumbs");
    }
    public void feature(){
        
        coveredWithHair();feedBreastMilk();
        opposableThumb();
    }
}
class Cow extends Mammal{
    public Cow(){
        super("Cow");
    }
    public void giveMilk(){
        System.out.println(getName()+" give miks");
    }
    public void feature(){
        
        coveredWithHair();feedBreastMilk();
        giveMilk();
    }
}
// Specific Reptile: Snake
class Snake extends Reptile {
    public Snake() {
        super("Snake");
    }

    public void isVenomous() {
        System.out.println("Some snakes are venomous.");
    }

    @Override
    public void feature() {
        canCrawl();
        haveScales();
        coldBlooded();
        isVenomous();
    }
}

// Specific Reptile: Crocodile
class Crocodile extends Reptile {
    public Crocodile() {
        super("Crocodile");
    }

    public void hasPowerfulJaws() {
        System.out.println("Crocodiles have powerful jaws.");
    }

    @Override
    public void feature() {
        canCrawl();
        haveScales();
        coldBlooded();
        hasPowerfulJaws();
    }
}

public class Q3 {
    public static void main(String[] args) {
        Animal[] animal={new Human(),new Cow(),new Crocodile(),new Snake()};
        for (Animal animal2 : animal) {
            System.out.println(animal2.getClass().getSimpleName()+" features are:");
            animal2.capableOfMotion();
            animal2.consumeFood();
            animal2.feature();
            System.out.println();
        }
    }
}
