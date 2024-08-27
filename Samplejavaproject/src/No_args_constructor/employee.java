package No_args_constructor;
class emp
{
    String empname;
    int emp_id;
    String address;
    emp()             //No args constructor
    {
        empname="Mubina";
        emp_id=01;
        address="amsjkfb jfsdi";
        System.out.println("Employee name:"+empname);
        System.out.println("Employee ID:"+emp_id);
        System.out.println("Address of employee:"+address);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class dep
{
    String depname;
    int dep_id;
    String location;
    dep()
    {
        depname="Managment";
        dep_id=20241;
        location="nskjdh kjdhfh";
        System.out.println("Department name:"+depname);
        System.out.println("Department id:"+dep_id);
        System.out.println("Department location:"+location);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class ins
{
    String ins_name;
    int ins_id;
    String nominy;
    ins()
    {
        ins_name="lic";
        ins_id=202;
        nominy="spouse";
        System.out.println("Insurance policy name:"+ins_name);
        System.out.println("Insurance id:"+ins_id);
        System.out.println("Nominy of the policy:"+nominy);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}

public class employee
{
    public static void main(String[] args)
    {
        emp e=new emp();
        dep d=new dep();
        ins i=new ins();
    }
}
