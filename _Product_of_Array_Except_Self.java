import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x[],n,prod=1;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    prod=prod*x[j];
                }
            }
            System.out.print(prod+" ");
            prod=1;
        }
    }
}