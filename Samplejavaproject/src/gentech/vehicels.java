package gentech;
class TwoWheeler
{
    String type;
    int noofseats;
    String model;
}
class FourWheeler
{
    String type;
    int noofseats;
    String model;
}
class HeavyWheeler
{
    String type;
    int noofseats;
    String model;
}
public class vehicels
{
    public static void main(String[] args)
    {
        TwoWheeler bike=new TwoWheeler();
        bike.model="new";
        bike.noofseats=3;
        bike.type="WomenTRA";
        System.out.println("WOMEN travler new bike type:"+bike.type);
        System.out.println("Number of seats avaliable:"+bike.noofseats);
        System.out.println("Model range:"+bike.model);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        FourWheeler car=new FourWheeler();
        car.model="new";
        car.noofseats=4;
        car.type="mid";
        System.out.println("Normal car that is of four wheeler:"+car.type);
        System.out.println("Number of seats:"+car.noofseats);
        System.out.println("Model of the car:"+car.model);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        HeavyWheeler JCB=new HeavyWheeler();
        JCB.type="old";
        JCB.model="yellow";
        JCB.noofseats=1;
        System.out.println("Normal type of heavy vehical:"+JCB.type);
        System.out.println("Number of seat:"+JCB.noofseats);
        System.out.println("Model:"+JCB.model);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}
