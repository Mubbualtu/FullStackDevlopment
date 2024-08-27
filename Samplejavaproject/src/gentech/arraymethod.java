package gentech;
class array
{
    void arraymethod(String a[])
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
public class arraymethod
{
    public static void main(String[] args)
    {
        String a[]={"mu","bi","na","al"};
        array arr=new array();
        arr.arraymethod(a);
    }
}
