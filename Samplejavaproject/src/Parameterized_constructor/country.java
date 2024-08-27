package Parameterized_constructor;
class countr
{
    String name;
    int pincode;
    countr(String n,int pin)
    {
        name=n;
        pincode=pin;
        System.out.println("name:"+name);
        System.out.println("pin:"+pin);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
class state1
{
    String name;
    int pincode;
    state1(String n,int pi)
    {
        name=n;
        pincode=pi;
        System.out.println("name:"+name);
        System.out.println("pincode:"+pincode);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class district4
{
 String name;
 district4(String n)
 {
     name=n;
     System.out.println("Name of the district:"+name);
     System.out.println("+++++++++++++++++++++++++++++");
 }
}
class village4
{
    String name;
    village4(String n)
    {
        name=n;
        System.out.println("Name of village:"+name);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
public class country
{
    public static void main(String args[])
    {
        countr c=new countr ("india",425416);
        district4 d=new district4 ("Bagalkot");
        state1 s=new state1 ("karnataka",646478);
        village4 v=new village4 ("bgk");
    }
}
