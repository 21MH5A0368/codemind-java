import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float A,s;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sc.close();
        s=(float)(a+b+c)/2;
        A=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",A);
    }
}