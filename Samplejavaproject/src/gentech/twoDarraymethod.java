package gentech;
class twoD
{
    void twoD(char c[][])
    {
        String con="";
        for(int i=0;i<c[0].length;i++)
        {
                con+=c[0][i];

        }System.out.println(con);
    }
}
public class twoDarraymethod
{
    public static void main(String[] args)
    {
        char c[][]={{'m','i'},{'a','l'}};
        twoD t=new twoD();
        t.twoD(c);
    }
}
