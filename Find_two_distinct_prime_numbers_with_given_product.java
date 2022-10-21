import java.util.Scanner;
class sample
{
    public static boolean isPrime(int n)
    {
        int i,count=0;
        if(n<2)
            return false;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a,b,c=0,flag=0;
        n=sc.nextInt();
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                if(isPrime(i) && isPrime(n/i))
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
           System.out.println(i+" "+n/i);
        else
           System.out.println("-1");
    }
}