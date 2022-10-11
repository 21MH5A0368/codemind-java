import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,x[],y[],i,c,j,z[],d=0;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n];
        y=new int[m];
        z=new int[n+m];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            y[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<m;j++)
            {
                if(x[i]==y[j])
                {
                    c=1;
                }
            }
            if(c==0)
            {
                z[d]=x[i];
                d++;
            }
        }
        for(i=0;i<m;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(y[i]==x[j])
                {
                    c=1;
                }
            }
            if(c==0)
            {
                z[d]=y[i];
                d++;
            }
        }
        for(i=0;i<d;i++)
        {
            System.out.print(z[i]+" ");
        }
    }
}