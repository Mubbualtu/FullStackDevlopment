package Parameterized_constructor;
class student3
{
    String name;
    int id;
    String address;
    student3(String n,int d,String add)
    {
        name=n;
        id=d;
        address=add;
        System.out.println(" name:"+name);
        System.out.println(" id:"+id);
        System.out.println("Address:"+address);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}
class lib1
{
    String name;
    int id;
    String location;
    lib1(String dn,int did,String l)
    {
        name=dn;
        id=did;
        location=l;
        System.out.println(" name:"+name);
        System.out.println(" id:"+id);
        System.out.println("Location of the lib:"+location);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
class spo3
{
    String name;
    int id;
    spo3(String in,int iid)
    {
        name=in;
        id=iid;
        System.out.println(" name:"+name);
        System.out.println(" id:"+id);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
class com
{
    String location;
    int noofcom;
    com(String l,int n)
    {
        location=l;
        noofcom=n;
        System.out.println("Loction:"+location);
        System.out.println("number of computers:"+noofcom);
        System.out.println("+++++++++++++++++++++++++++++++++");
    }

}
public class stu
{
    public static void main(String[] args)
    {
        com e=new com ("mdfbdsjfk",25454);
        lib1 d=new lib1 ("Management",2145,"dhiwuhfnih");
        spo3 i=new spo3 ("hockey",24541);
        student3 s=new student3 ("Mubina",21,"dsdvsvsvfgaf");
    }
}
