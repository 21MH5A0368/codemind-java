import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        float a;
        r=sc.nextInt();
        sc.close();
        a=(float)(3.14*r*r);
        System.out.format("%.2f",a);
    }
}