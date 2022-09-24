import java.util.Scanner;
class sample
{
    public static boolean isperfect(int n)
    {
        int i,sum=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(isperfect(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}