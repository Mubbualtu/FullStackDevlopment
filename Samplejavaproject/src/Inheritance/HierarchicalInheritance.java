package Inheritance;
class Animal
{
   void eat()
   {
        System.out.println("Animal is eating.");
    }
    void sleep()
    {
        System.out.println("Animal is sleeping.");
    }
}

// class 1
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is barking.");
    }
}

//  class 2
class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat is meowing.");
    }
}

public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        Cat cat = new Cat();

        //  methods from the animal class
        dog.eat();
        dog.sleep();
        // method of Dog
        dog.bark();
        //  methods of class
        cat.eat();
        cat.sleep();
        //  method of Cat
        cat.meow();
    }
}
