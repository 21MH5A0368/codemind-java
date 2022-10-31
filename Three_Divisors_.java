import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isdiv(int n)
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==3)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,n;
        n=sc.nextInt();
        for(i=2;i*i<=n;i++)
        {
            if( isprime(i) && i*i<=n )
            {
                count++;
            }
        }
        System.out.println(count);
    }
}