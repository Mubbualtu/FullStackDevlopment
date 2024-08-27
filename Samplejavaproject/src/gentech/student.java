package gentech;
class library
{
    int noofbooks;
    String location;
    String staff;
}
class sports
{
    String name;
    int id;
}
class computerlabs
{
    String location;
    int nooflabs;
}
public class student
{
    public static void main(String[] args)
    {
        library l=new library();
        l.location="left of placement cell";
        l.noofbooks=1009;
        l.staff="Ranjana";
        System.out.println("number of books:"+l.noofbooks);
        System.out.println("the location:"+l.location);
        System.out.println("the incharge staff:"+l.staff);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        sports s=new sports();
        s.id=5;
        s.name="hockey";
        System.out.println("id of sports:"+s.id);
        System.out.println("name of the sports:"+s.name);
        System.out.println("++++++++++++++++++++++++++++++++++++");

        computerlabs c=new computerlabs();
        c.location="right to staff office";
        c.nooflabs=2;
        System.out.println("location of the labs:"+c.location);
        System.out.println("number of labs:"+c.nooflabs);
        System.out.println("++++++++++++++++++++++++++++++++++++");


    }
}
