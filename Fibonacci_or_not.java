import java.util.Scanner;
class sample
{
    public static int isfibonacci (int n)
    {
        int a=0,b=1,c;
        c=a+b;
        for(int i=0; ;i++)
        {
            a=b;
            b=c;
            c=a+b;
            if( c==n || c>n )
                break;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(n==isfibonacci(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
