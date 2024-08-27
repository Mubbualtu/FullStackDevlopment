package gentech;
class country
{
    int pincode;
    String name;
}
class state
{
    int pincode;
    String name;
}
class District
{
    String name;
}
class Village
{
    String name;
}
public class location
{
    public static void main(String[] args) {
        country in = new country();
        in.name = "India";
        in.pincode = 22254;
        System.out.println("Country name:" + in.name);
        System.out.println("pin code:" + in.pincode);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        state karnataka = new state();
        karnataka.name = "Karnataka";
        karnataka.pincode = 12345;
        System.out.println("name of the state:" + karnataka.name);
        System.out.println("pincode of the state:" + karnataka.pincode);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        District bgk = new District();
        bgk.name = "Bagalkot";
        System.out.println("name of district:"+bgk.name);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Village vi=new Village();
        vi.name="Bagalkot";
        System.out.println("name of the village:"+vi.name);
    }
}
