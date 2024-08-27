package method_assignments;
class sum
{
    void sum1D(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }System.out.println(sum);
    }
}
public class oneDIntSum
{
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6};
        sum o=new sum();
        o.sum1D(a);
    }
}
