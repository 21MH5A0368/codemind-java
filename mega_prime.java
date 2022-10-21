import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
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
        int n,c=0,d,r,temp;
        n=sc.nextInt();
        sc.close();
        temp=n;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            if(isprime(r))
            {
                c++;
            }
            n=n/10;
        }
        if(d==c && isprime(temp))
           System.out.println("Mega Prime");
        else
           System.out.println("Not Mega Prime");
    }
}