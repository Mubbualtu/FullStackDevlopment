package Inheritance;

class LivingBeing4
{
    String name;
    int age;
    //constructor 1
    LivingBeing4(String name)
    {
        this.name = name;
        System.out.println(name + " is a living being.");
    }
    //constructor 2
    LivingBeing4(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println(name + " is a living being, age " + age + ".");
    }
    void breathe()
    {
        System.out.println(name + " is breathing.");
    }
}

// Subclass 1
class Animal4 extends LivingBeing4
{
    // Constructor 1 of superclass
    Animal4(String name)
    {
        super(name);
        System.out.println(name + " is an animal.");
    }
    // Constructor 2 of superclass
    Animal4(String name, int age)
    {
        super(name, age);
        System.out.println(name + " is an animal, age " + age + ".");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass 2
class Mammal4 extends Animal4
{
    // Constructor 1 calling superclass const 1
    Mammal4(String name)
    {
        super(name);
        System.out.println(name + " is a mammal.");
    }
    // Constructor 2 calling superclass const 2
    Mammal4(String name, int age)
    {
        super(name, age);
        System.out.println(name + " is a mammal, age " + age + ".");
    }
    void walk()
    {
        System.out.println(name + " is walking.");
    }
}

public class Multileveloverloading
{
    public static void main(String[] args)
    {
        System.out.println("Using first constructor:");
        Mammal4 mammal1 = new Mammal4("Tiger");

        //  methods from LivingBeing class
        mammal1.breathe();

        // methods from Animal class
        mammal1.eat();

        //  methods from Mammal class
        mammal1.walk();

        System.out.println("\nUsing second constructor:");
        Mammal4 mammal2 = new Mammal4("Elephant", 10);

        //  methods from LivingBeing class
        mammal2.breathe();

        //  methods from Animal class
        mammal2.eat();

        //  methods from Mammal class
        mammal2.walk();
    }
}

