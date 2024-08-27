package No_args_constructor;
class coun
{
    String name;
    int pincode;
    coun()
    {
        name="India";
        pincode=52114;
        System.out.println("Name of the country:"+name);
        System.out.println("pincode:"+pincode);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
class sts
{
    String name;
    int pin;
    sts()
    {
        name="karnataka";
        pin=36526;
        System.out.println("Name of the state:"+name);
        System.out.println("Pincode:"+pin);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
class dis
{
    String name;
    dis()
    {
        name="Bagalkot";
        System.out.println("Name of the district:"+name);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
class vil
{
    String name;
    vil()
    {
        name="BGK";
        System.out.println("Name of the village:"+name);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
public class distance
{
    public static void main(String args[])
    {
        coun c=new coun();
        sts s=new sts();
        dis d=new dis();
        vil v=new vil();
    }
}
