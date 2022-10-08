import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],y[],j=0,n,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==1)
            {
                y[j]=x[i];
                j++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                y[j]=x[i];
                j++;
            }
        }
        for(j=0;j<n;j++)
        {
            System.out.print(y[j]+" ");
        }
    }
}