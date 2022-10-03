import java.util.Scanner;
class sample
{
    public static boolean isself(int n)
    {
        int temp=n,c=0,d,r;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            if(r==0)
            {
                break;
            }
            if(temp%r==0)
            {
                c++;
            }
            n=n/10;
        }
        if(d==c)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i;
        m=sc.nextInt();
        n=sc.nextInt();
        sc.close();
        for(i=m;i<=n;i++)
        {
            if(isself(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}