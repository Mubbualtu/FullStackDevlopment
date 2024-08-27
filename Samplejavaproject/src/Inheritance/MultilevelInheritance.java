package Inheritance;

class Grandparent
{
    String name;
    public Grandparent(String name)
    {
        this.name = name;
    }
    public void displayName()
    {
        System.out.println("Grandparent's name is " + name);
    }
}

class Parent extends Grandparent
{
    public Parent(String name)
    {
        super(name);
    }
    public void displayParentName()
    {
        System.out.println("Parent's name is " + name);
    }
}

class Child extends Parent
{
    public Child(String name)
    {
        super(name);
    }
    public void displayChildName()
    {
        System.out.println("Child's name is " + name);
    }
}
public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Child child = new Child("John");
        child.displayName();         // From Grandparent class
        child.displayParentName();   // From Parent class
        child.displayChildName();    // From Child class
    }
}


