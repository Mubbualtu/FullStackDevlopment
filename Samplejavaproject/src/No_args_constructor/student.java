package No_args_constructor;
class student1
{
    String name;
    int rollno;
    String address;
    int age;
    student1()
    {
        name="Mubina";
        rollno=20;
        address="dnfkjwfhi";
        age=22;
        System.out.println("Name of the student:"+name);
        System.out.println("Rollno of the student:"+rollno);
        System.out.println("Address of the student:"+address);
        System.out.println("age of the student:"+age);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
class library1
{
    String staff;
    int noofbooks;
    library1()
    {
        staff="Altaf";
        noofbooks=822;
        System.out.println("Staff incharge:"+staff);
        System.out.println("number of books:"+noofbooks);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
class sports1
{
    String name;
    int noofgames;
    String incharge;
    sports1()
    {
        name="Hockey";
        noofgames=15;
        incharge="Uzma";
        System.out.println("Name of the game:"+name);
        System.out.println("number of games:"+noofgames);
        System.out.println("Staff incharge for sports:"+incharge);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class computerlab1
{
    String location;
    int noofcomputers;
    computerlab1()
    {
        location="left to placement";
        noofcomputers=25;
        System.out.println("Location of the computer lab:"+location);
        System.out.println("Number of computers:"+noofcomputers);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
public class student
{
    public static void main(String[] args)
    {
        student1 s=new student1();
        library1 l=new library1();
        sports1 p=new sports1();
        computerlab1 c=new computerlab1();
    }
}
