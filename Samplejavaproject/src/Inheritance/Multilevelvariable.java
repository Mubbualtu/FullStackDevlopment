package Inheritance;

class humanbeing0
{
    String name;
    humanbeing0(String name)
    {
        this.name = name;
        System.out.println("humnBeing: " + this.name);
    }
    void display()
    {
        System.out.println("humnBeing name: " + name);
    }
}

// Subclass 1
class man0 extends humanbeing0
{
    String name;
    man0(String name, String manName)
    {
        super(name);
        this.name = manName;
        System.out.println("man: " + this.name);
    }
    void display()
    {
        super.display();
        System.out.println("man name: " + name);
    }
}

class women0 extends man0
{
    String name;
    women0(String name, String manName, String womenName)
    {
        super(name, manName);
        this.name = womenName;
        System.out.println("women: " + this.name);
    }
    void display()
    {
        super.display();
        System.out.println("women name: " + name);
    }
}

public class Multilevelvariable
{
    public static void main(String[] args)
    {
        women0 mammal = new women0("old man", "Altaf", "Mubina");
        mammal.display();
    }
}
