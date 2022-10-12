import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,x[],y[],i,c=0,j,count=0;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n];
        y=new int[m];
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
            if(x[i]!=-999)
            {
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] && i!=j)
                    {
                        x[j]=-999;
                    }
                }
            }
        }
        for(i=0;i<m;i++)
        {
            if(y[i]!=-999)
            {
                for(j=0;j<m;j++)
                {
                    if(y[i]==y[j] && i!=j)
                    {
                        y[j]=-999;
                    }
                }
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
            if(x[i]!=-999)
            {
                for(j=0;j<m;j++)
                {
                    if(x[i]==y[j])
                    {
                        c=1;
                    }
                }
                if(c==0)
                {
                    count++;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            
            if(y[i]!=-999)
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
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}