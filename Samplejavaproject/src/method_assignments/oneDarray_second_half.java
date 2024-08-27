package method_assignments;
class oneD
{
    void one(String s[])
    {

        for(int i=s.length/2;i<s.length;i++)
        {
            System.out.println(s[i]+ " ");
        }
    }
}
public class oneDarray_second_half
{
    public static void main(String[] args)
    {
        String s[]={"mubina","mubbu","uzma","balikai","ammi","abba"};
        oneD o=new oneD();
        o.one(s);
    }
}
