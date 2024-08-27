package gentech;
class product
{
    String name;
    int id;
}
class sales
{
    String range;
    int noofsales;
}
class order
{
    int nooforders;
    String status;
}
class invest
{
    int id;
    String name;
    int amount;
    int shares;
}
public class bussines
{
    public static void main(String[] args)
    {
        product p=new product();
        p.id=1;
        p.name="engine";
        System.out.println("product name:"+p.name);
        System.out.println("id of the product:"+p.id);
        sales s=new sales();
        s.noofsales=50;
        s.range="mid";
        System.out.println("number of salses:"+s.noofsales);
        System.out.println("range of sales:"+s.range);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        order o=new order();
        o.nooforders=60;
        o.status="In progress";
        System.out.println("number of orders:"+o.nooforders);
        System.out.println("status:"+o.status);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        invest i=new invest();
        i.id=2;
        i.amount=2000000;
        i.name="SAM";
        i.shares=4;
        System.out.println("id:"+i.id);
        System.out.println("amount:"+i.amount);
        System.out.println("shares:"+i.shares);
        System.out.println("name:"+i.name);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
