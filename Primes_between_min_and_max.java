import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        int i,count=0;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,min,max,a=0,b=0,c,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        min=x[0];
        max=x[0];
        for(i=0;i<n;i++)
        {
            if(x[i]<min)
            {
                min=x[i];
                a=i;
            }
            if(x[i]>max)
            {
                max=x[i];
                b=i;
            }
        }
        if(a>b)
        {
            c=a;
            a=b;
            b=c;
        }
        for(i=a;i<=b;i++)
        {
            if(isprime(x[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}