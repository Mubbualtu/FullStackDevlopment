package ABSTRACTCLASS;

abstract class mankind
{
    mankind()
    {
        System.out.println("LivingBeing default constructor called.");
    }
    mankind(String name)
    {
        System.out.println("LivingBeing parameterized constructor called with name: " + name);
    }
}

class men extends mankind
{
    men()
    {
        super();
        System.out.println("default constructor called.");
    }
    men(String name)
    {
        super(name);
        System.out.println("parameterized constructor called with name: " + name);
    }
}
class women extends mankind
{
    women()
    {
        super();
        System.out.println("Mammal default constructor called.");
    }
    women(String name)
    {
        super(name);
        System.out.println("Mammal parameterized constructor called with name: " + name);
    }
}

public class MultilevelWithConstructors
{
    public static void main(String[] args)
    {
        System.out.println("Creating women instance with default constructor:");
        women mammalDefault = new women();
        System.out.println();
        System.out.println("Creating women instance with parameterized constructor:");
        women mammalParameterized = new women("mubina");
    }
}

