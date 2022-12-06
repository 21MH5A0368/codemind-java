import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x[],n,count,c=0,flag=0;
        float avg,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
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
                sum=sum+x[i];
                flag=1;
                c++;
            }
        }
        avg=sum/c;
        if(flag==1)
            System.out.format("%.2f",avg);
        else
            System.out.println("-1");
    }
}