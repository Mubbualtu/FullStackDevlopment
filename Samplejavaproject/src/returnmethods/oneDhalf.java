package returnmethods;
class oneD
{
    int[] array(int a[])
    {
        int b[]=new int[a.length/2];
        for(int i=0;i<a.length/2;i++)
        {
            b[i]=a[i];
        }
        return b;
    }
}
public class oneDhalf
{
    public static void main(String[] args)
    {
        int a[]={2,3,4,5,6,7};
        oneD o=new oneD();
        int  b[]=o.array(a);
        for(int j=0;j<b.length;j++)
        {
            System.out.println(b[j]+" ");
        }
    }
}
