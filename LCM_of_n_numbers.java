import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j,max;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n-1;i++)
        {
            if(x[i]>x[i+1])
            {
                max=x[i];
            }
            else
            {
                max=x[i+1];
            }
            for(j=max; ;j++)
            {
                if(j%x[i]==0 && j%x[i+1]==0)
                {
                    x[i+1]=j;
                    break;
                }
            }
        }
        System.out.println(x[i]);
    }
}