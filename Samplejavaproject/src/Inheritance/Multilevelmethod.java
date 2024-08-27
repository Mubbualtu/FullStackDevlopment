package Inheritance;

class Men
{
    String name;
    void showDetails(String name)
    {
        System.out.println("LivingBeing: " + name);
    }
}

class Women extends Men {
    void showDetails(String name)
    {
        super.showDetails("yes");
        System.out.println("boy: " + name);
    }
}

class Girl extends Women {
    void showDetails(String name)
    {
        super.showDetails("altaf");
        System.out.println("Girl: " + name);
    }
}

public class Multilevelmethod {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.showDetails("mubina");  // Calling with a name
    }
}
