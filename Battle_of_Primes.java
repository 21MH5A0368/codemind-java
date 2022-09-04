import java.util.Scanner;
class sample
{
    public static boolean isprime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
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
        int n1,n2,n3,w,t,i;
        n1=sc.nextInt();
        n2=sc.nextInt();
        w=n1+n2;
        for(i=w+1; ;i++)
        {
           if(isprime(i))
           {
               n3=i;
               break;
           }
        }
        t=n3-w;
        System.out.println(t);
        sc.close();
    }
}