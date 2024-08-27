package returnmethods;
class reverse
{
    double[] first(double[] second)
    {
        double d[]=new double[second.length];
        for(int i=0;i<second.length;i++)
        {
            d[i]=second[i];
        }return d;
    }

}
public class double1Dreverse
{
    public static void main(String[] args)
    {
        double d[] = {20d, 30d, 12d, 23d};
        reverse r = new reverse();
        double[] t = r.first(d);
        for (int i=t.length-1;i>=0;i--)
        {
            System.out.println(t[i] + " ");
        }
    }
}
