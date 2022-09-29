import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,m;
        a=sc.nextFloat();
        b=sc.nextFloat();
        sc.close();
        m=(float)a*b;
        System.out.format("%.2f",m);
    }
}