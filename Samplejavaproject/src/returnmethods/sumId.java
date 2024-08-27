package returnmethods;
class oneDsum
{
    int a(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        return sum;
    }

}
public class sumId
{
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7};
        oneDsum o = new oneDsum();
        int sum = o.a(a);
        System.out.println(sum);
    }
}
