import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x[],n,count,min,max=0,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        min=x[n-1];
        for(i=0;i<n;i++)
        {
            count=1;
            if(x[i]!=-99)
            {
                for(j=0;j<n;j++)
                {
                    if(x[i]==x[j] &&i!=j)
                    {
                        count++;
                        x[j]=-99;
                    }
                }
            }
            if(x[i]==count)
            {
                if(x[i]>max)
                {
                    max=x[i];
                }
                if(x[i]<min)
                {
                    min=x[i];
                }
                flag=1;
            }
        }
        if(flag==1)
            System.out.print(min+" "+max);
        else
            System.out.println("-1");
    }
}