package No_args_constructor;
class two
{
    String model;
    int wheels;
    int noofseats;
    two()
    {
        model="houda";
        wheels=2;
        noofseats=2;
        System.out.println("Model of the two wheeler:"+model);
        System.out.println("no of wheels:"+wheels);
        System.out.println("Number of seats:"+noofseats);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class four
{
    String model;
    int wheels;
    int noofseats;
    four()
    {
        model="thar";
        wheels=4;
        noofseats=4;
        System.out.println("Modle of the car:"+model);
        System.out.println("Wheels of the car:"+wheels);
        System.out.println("Number of  seats:"+noofseats);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class more
{
    String model;
    int wheels;
    int noofseats;
    more()
    {
        model="JCB";
        wheels=3;
        noofseats=1;
        System.out.println("model of the vehical:"+model);
        System.out.println("Wheels of the vehicals:"+wheels);
        System.out.println("Number of seats:"+noofseats);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
public class wheelers
{
    public static void main(String args[])
    {
        two t=new two();
        four f=new four();
        more r=new more();
    }
}
