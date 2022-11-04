import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y[],n,i,j,max=0;
        n=sc.nextInt();
        y=new int[n];
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(y[j]>max)
                {
                    max=y[j];
                    y[i]=max;
                }
            }
            max=0;
        }
        for(i=0;i<n-1;i++)
        {
            System.out.print(y[i]+" ");
        }
        System.out.println("-1");
    }
}