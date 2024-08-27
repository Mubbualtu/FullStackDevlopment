package No_args_constructor;
class pro
{
    String name;
    int noofpro;
    String quality;
    pro()
    {
        name="samsung";
        noofpro=84;
        quality="best";
        System.out.println("name of the product:"+name);
        System.out.println("Number of product:"+noofpro);
        System.out.println("Quality of the product:"+quality);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
class sal
{
    String range;
    int noofsales;
    sal()
    {
        range="mid";
        noofsales=54;
        System.out.println("Range of the sales:"+range);
        System.out.println("number of sales:"+noofsales);
        System.out.println("+++++++++++++++++++++++++++++++++");

    }
}
class or
{
    int nooforder;
    or()
    {
        nooforder=25;
        System.out.println("Number of orders:"+nooforder);
        System.out.println("+++++++++++++++++++++++++++++++++");

    }
}
class inv
{
    String name;
    int amount;
    int sharse;
    inv()
    {
        name="Mubina";
        amount=50000000;
        sharse=50;
        System.out.println("Name of the investor:"+name);
        System.out.println("Amount invested:"+amount);
        System.out.println("sharse in company:"+sharse);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
public class product1
{
    public static void  main(String args[])
    {
        pro p=new pro();
        or o=new or();
        sal s=new sal();
        inv i=new inv();
    }
}
