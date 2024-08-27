package Parameterized_constructor;
class tw
{
    String model;
    int noofseats;
    tw(String m,int n)
    {
        model=m;
        noofseats=n;
        System.out.println("model:"+model);
        System.out.println("number of seats:"+noofseats);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
class fu
{
    String model;
    int noofseats;
    fu(String m,int n)
    {
        model=m;
        noofseats=n;
        System.out.println("model:"+model);
        System.out.println("number of seats:"+noofseats);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
class mo
{
    String model;
    int noofseats;
    mo(String m,int n)
    {
        model=m;
        noofseats=n;
        System.out.println("model:"+model);
        System.out.println("number of seats:"+noofseats);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
public class wheelscount
{
    public static void main(String args[])
    {
        tw two=new tw ("yamaha",2);
        fu four=new fu ("maruti",4);
        mo more=new mo ("JCB",1);
    }
}
