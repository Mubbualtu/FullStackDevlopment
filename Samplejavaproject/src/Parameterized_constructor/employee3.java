package Parameterized_constructor;
class emp
{
    String empname;
    int emp_id;
    String address;
    emp(String n,int id,String add)
    {
        empname=n;
        emp_id=id;
        address=add;
        System.out.println("Employee name:"+empname);
        System.out.println("Employee id:"+emp_id);
        System.out.println("Address:"+address);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
class department1
{
    String depname;
    int dep_id;
    String location;
    department1(String dn,int did,String l)
    {
        depname=dn;
        dep_id=did;
        location=l;
        System.out.println("department name:"+depname);
        System.out.println("Department id:"+dep_id);
        System.out.println("Location of the dep:"+location);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
class insu
{
    String ins_name;
    int ins_id;
    String nominy;
    insu(String in,int iid,String n)
    {
        ins_name=in;
        ins_id=iid;
        nominy=n;
        System.out.println("Insurance name:"+ins_name);
        System.out.println("Insurance id:"+ins_id);
        System.out.println("Nominy:"+nominy);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
public class employee3
{
    public static void main(String args[])
    {
        emp e=new emp("Mubina",2554,"mdfbdsjfk");
        department1 d=new department1 ("Management",2145,"dhiwuhfnih");
        insu i=new insu("lic",24541,"spouse");
    }
}
