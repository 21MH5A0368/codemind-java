import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,a,i,b,r,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        r=a;
        for(i=0;i<n;i++)
        {
            if( x[i]>=a && x[i]<=b )
            {
                c++;
                if(x[i]>r)
                {
                    r=x[i];
                }
            }
        }
        if(c>0)
            System.out.println(r);
        else
            System.out.println("-1");
        sc.close();
    }
}