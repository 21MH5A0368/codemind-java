import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,a,i,b,min,max=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]>max)
            {
                max=x[i];
            }
        }
        a=sc.nextInt();
        b=sc.nextInt();
        min=max;
        for(i=0;i<n;i++)
        {
            if( x[i]>=a && x[i]<=b )
            {
                continue;
            }
                c++;
                if(x[i]<min)
                {
                    min=x[i];
                }
        }
        if(c>0)
            System.out.println(min);
        else
            System.out.println("-1");
        sc.close();
    }
}