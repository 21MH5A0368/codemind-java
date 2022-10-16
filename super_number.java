import java.util.Scanner;
class sample
{
    public static int issum(int n)
    {
        int sum=0;
        while( n>0 )
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(n%2==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static int issumfact(int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                if(isprime(i))
                {
                    sum=sum+issum(i);
                    n=n/i;
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,b;
        n=sc.nextInt();
        a=issum(n);
        b=issumfact(n);
        if(a==b)
            System.out.println("1");
        else
            System.out.println("0");
    }
}