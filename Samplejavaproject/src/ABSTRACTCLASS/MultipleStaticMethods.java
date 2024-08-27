package ABSTRACTCLASS;

abstract class devices
{
    // Static method 1
    static void name()
    {
        System.out.println("deives name.");
    }
    // Static method 2
    static void type()
    {
        System.out.println("type of deives.");
    }
}
// Subclass
class company extends devices
{
    static void type()
    {
        System.out.println("samsung.");
    }
}
public class MultipleStaticMethods
{
    public static void main(String[] args)
    {
        devices.name();
        devices.type();
        company.type();
    }
}

