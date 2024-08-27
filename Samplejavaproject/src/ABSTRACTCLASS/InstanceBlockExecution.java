package ABSTRACTCLASS;

abstract class LivingBeing6
{
    {
        System.out.println("Instance block in LivingBeing executed.");
    }
}

class Animal6 extends LivingBeing6
{
    Animal6()
    {
        System.out.println("Animal constructor called.");
    }
}

public class InstanceBlockExecution
{
    public static void main(String[] args)
    {
        Animal6 animal = new Animal6();
    }
}

