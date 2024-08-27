package returnmethods;
class secondhalf
{
    short[] array(short a[])
    {
        int start=a.length/2;
        short s[]=new short[a.length-start];
        for(int i=start;i<a.length;i++)
        {
            s[i-start]=a[i];
        }
       return s;
    }
}
public class short1dsecond
{
    public static void main(String[] args)
    {
        short a[]={0,3,8,5,2,4};
        secondhalf s=new secondhalf();
        short[] e=s.array(a);
        for(int j=0;j<e.length;j++)
        {
            System.out.println(e[j]+" ");
        }
    }
}
