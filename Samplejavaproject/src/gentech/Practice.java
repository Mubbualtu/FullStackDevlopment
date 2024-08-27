package gentech;
class employee
{
    String empname;
    int age;
    int emp_id;
    String address;
}
class department
{
    String depname;
    int dep_id;
    String Location;
}
class insurance
{
    String Policyname;
    int id;
    String nominy;
    int emp_id;
}
public class Practice
{
    public static void main(String args[])
    {
        employee Mubbu=new employee();
        Mubbu.empname="Mubina";
        Mubbu.age=21;
        Mubbu.emp_id=0124;
        Mubbu.address="main street beside busstand";
        System.out.println("Employee name:"+Mubbu.empname);
        System.out.println("Age:"+Mubbu.age);
        System.out.println("emp_id:"+Mubbu.emp_id);
        System.out.println("Address:"+Mubbu.address);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        department manage=new department();
        manage.depname="Management";
        manage.dep_id=2024;
        manage.Location="left to main department";
        System.out.println("Department name:"+manage.depname);
        System.out.println("Department id:"+manage.dep_id);
        System.out.println("Location:"+manage.Location);
        System.out.println("++++++++++++++++++++++++++++++++++++");
        insurance lic=new insurance();
        lic.Policyname="oneyear";
        lic.emp_id=0124;
        lic.id=1002;
        lic.nominy="spouse";
        System.out.println("LIC name:"+lic.Policyname);
        System.out.println("User_id of Policy:"+lic.emp_id);
        System.out.println("LIC id:"+lic.id);
        System.out.println("LIC user nominy:"+lic.nominy);
        System.out.println("++++++++++++++++++++++++++++++++++++");

    }

}
