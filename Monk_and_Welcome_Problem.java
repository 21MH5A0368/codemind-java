import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x[],y[],a[];
        n=sc.nextInt();
        x=new int[n];
        y=new int[n];
        a=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            a[i]=x[i]+y[i];
            System.out.print(a[i]+" ");
        }
    }
}