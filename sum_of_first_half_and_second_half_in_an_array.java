import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,sum1=0,sum2=0,n;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(i<n/2)
            {
                sum1=sum1+x[i];
            }
            if(i>=n/2)
            {
                sum2=sum2+x[i];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}