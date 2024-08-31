package gentech;
class array1
{
    void arraymethod(String a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
public class newcla
{
    public static void main(String[] args)
    {
        String a[]={"mu","bi","na","al"};
        array1 arr=new array1();
        arr.arraymethod(a);
    }
}
