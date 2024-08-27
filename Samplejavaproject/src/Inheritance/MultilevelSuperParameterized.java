package Inheritance;
// Superclass
class LivingBeing5
{
    String name;
    LivingBeing5(String name)
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
class Animal5 extends LivingBeing5
{
    Animal5(String name)
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
class Mammal5 extends Animal5
{
    Mammal5(String name)
    {
        super(name);
        System.out.println(name + " is a mammal.");
    }
    void walk()
    {
        System.out.println(name + " is walking.");
    }
}

public class MultilevelSuperParameterized
{
    public static void main(String[] args)
    {
        Mammal5 mammal = new Mammal5("Tiger");

        //  methods from LivingBeing class
        mammal.breathe();

        //  methods from Animal class
        mammal.eat();

        //  methods from Mammal class
        mammal.walk();
    }
}

