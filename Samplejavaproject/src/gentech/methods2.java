package gentech;
class count
{
    void count()
    {
        int count=0;
        for(int i=50;i<=150;i++)
        {
            if(i%6==0)
            {
                count = count + 1;
            }
        }System.out.println("count:"+count);
    }
}

public class methods2
{
    public static void main(String args[])
    {
        count c=new count();
        c.count();
    }
}
