package ABSTRACTCLASS;

abstract class LivingBeing
{
    String getName()
    {
        return "Living Being";
    }
    int getAge()
    {
        return 100;
    }
}
class Animal extends LivingBeing
{
}

public class AbstractClassReturnValue
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
    }
}

