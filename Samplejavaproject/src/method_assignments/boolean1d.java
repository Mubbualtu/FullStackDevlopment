package method_assignments;
class boolRev
{
    void reverse(boolean b[])
    {
        for(int i=b.length-1;i>=0;i--)
        {
            System.out.println(b[i]+" ");
        }
    }
}
public class boolean1d
{
    public static void main(String[] args)
    {
        boolean b[]={true,false};
                boolRev o=new boolRev();
                o.reverse(b);
    }
}
