package Parameterized_constructor;
class p
{
    String name;
    int noofpr;
    p(String n,int no)
    {
        name=n;
        noofpr=no;
        System.out.println("product name:"+name);
        System.out.println("number of product:"+noofpr);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
class s
{
    int noofs;
    s(int n)
    {
        noofs=n;
        System.out.println("Number of sales:"+noofs);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
class o
{
    int noofo;
    o(int or)
    {
        noofo=or;
        System.out.println("number of order:"+noofo);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
public class product5
{
    public static void main(String args[])
    {
        o order=new o (40);
        p produt=new p ("samsung",50);
        s sale=new s (24165);
    }
}
