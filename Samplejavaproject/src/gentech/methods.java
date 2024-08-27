package gentech;
class sum
{
    void sum()
    {
        int sum=0;
        for(int i=1;i<=50;i++)
        {
            sum=sum+i;

        }System.out.println("sum of the numbers:"+sum);
    }


}
public class methods
{
    public static void main(String args[])
    {
        sum s=new sum();
        s.sum();
    }
}
