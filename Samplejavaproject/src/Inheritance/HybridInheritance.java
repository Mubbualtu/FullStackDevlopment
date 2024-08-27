package Inheritance;

class LivingBeing2
{
    void breathe()
    {
        System.out.println("Living being is breathing.");
    }
}

// class 2
class Animal2 extends LivingBeing2
{
    void eat()
    {
        System.out.println("Animal is eating.");
    }
}

// class 3
class Mammal2 extends LivingBeing2
{
    void walk()
    {
        System.out.println("Mammal is walking.");
    }
}

//  class derived from both Animal
class Bat2 extends Animal2
{
    // Overriding the eat method
    void eat()
    {
        System.out.println("Bat is eating.");
    }
    Mammal2 mammal = new Mammal2();
    void fly()
    {
        System.out.println("Bat is flying.");
    }
    void walk()
    {
        mammal.walk();
    }
}
public class HybridInheritance {
    //  class 1
    class LivingBeing2 {
        void breathe() {
            System.out.println("Living being is breathing.");
        }
    }

    //  class 2
    class Animal2 extends LivingBeing2 {
        void eat() {
            System.out.println("Animal is eating.");
        }
    }

    // Another class
    class Mammal2 extends LivingBeing2 {
        void walk() {
            System.out.println("Mammal is walking.");
        }
    }

    // class from both Animal and Mammal
    class Bat2 extends Animal2 {
        void eat() {
            System.out.println("Bat is eating.");
        }

        Mammal2 mammal = new Mammal2();

        void fly() {
            System.out.println("Bat is flying.");
        }

        void walk() {
            mammal.walk();
        }
    }
}
