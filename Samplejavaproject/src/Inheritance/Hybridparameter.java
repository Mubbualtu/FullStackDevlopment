package Inheritance;

class LivingBeing3
{
    String name;
    // Parameterized const
    LivingBeing3(String name)
    {
        this.name = name;
        System.out.println(name + " is a living being.");
    }
    void breathe()
    {
        System.out.println(name + " is breathing.");
    }
}
// Subclass 1
class Animal3 extends LivingBeing3
{
    // Constructor calling parameterized constructor of LivingBeing
    Animal3(String name)
    {
        super(name);
        System.out.println(name + " is an animal.");
    }
    void eat()
    {
        System.out.println(name + " is eating.");
    }
}
// Subclass 2
class Bird3 extends LivingBeing3
{
    // Constructor calling parameterized constructor of LivingBeing
    Bird3(String name)
    {
        super(name);
        System.out.println(name + " is a bird.");
    }
    void fly()
    {
        System.out.println(name + " is flying.");
    }
}
// Subclass 3 from Animal
class Mammal3 extends Animal3
{
    // Constructor calling parameterized constructor of Animal
    Mammal3(String name)
    {
        super(name);
        System.out.println(name + " is a mammal.");
    }
    void walk()
    {
        System.out.println(name + " is walking.");
    }
}
public class Hybridparameter
{
    public static void main(String[] args)
    {
        System.out.println("Creating a Mammal object:");
        Mammal3 mammal = new Mammal3("Tiger");
        //  methods from LivingBeing, Animal, and Mammal classes
        mammal.breathe();
        mammal.eat();
        mammal.walk();

        System.out.println("\nCreating a Bird object:");
        Bird3 bird = new Bird3("Eagle");

        //  methods from LivingBeing and Bird classes
        bird.breathe();
        bird.fly();
    }
}
