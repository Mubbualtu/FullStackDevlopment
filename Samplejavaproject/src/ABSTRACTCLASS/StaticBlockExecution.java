package ABSTRACTCLASS;

abstract class LivingBeing1
{
    static
    {
        System.out.println("Static block in LivingBeing executed.");
    }
}

class Animal1 extends LivingBeing1
{
    static void display()
    {
        System.out.println("Animal class method called.");
    }
}

public class StaticBlockExecution
{
    public static void main(String[] args)
    {
        Animal1.display();
    }
}
