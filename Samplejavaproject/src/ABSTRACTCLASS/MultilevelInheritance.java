package ABSTRACTCLASS;

abstract class LivingBeing7
{
    String getType()
    {
        return "Generic Living Being";
    }
    String getName()
    {
        return "Living Being";
    }
}
class Animal7 extends LivingBeing7
{
    String getType()
    {
        return "Animal";
    }
}

class Mammal7 extends Animal7
{
    String getType()
    {
        return "Mammal";
    }
    String getName()
    {
        return "Mammal is Being";
    }
}

public class MultilevelInheritance
{
    public static void main(String[] args)
    {
        Mammal7 mammal = new Mammal7();
        System.out.println("Type: " + mammal.getType());
        System.out.println("Name: " + mammal.getName());
    }
}

