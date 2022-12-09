import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],m,y[],n,i,c=0,k;
        m=sc.nextInt();
        x=new int[m];
        for(i=0;i<m;i++)
        {
            x[i]=sc.nextInt();
        }
        n=sc.nextInt();
        y=new int[n];
        for(i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
        k=sc.nextInt();
        sc.close();
        for(i=0;i<m;i++)
        {
            if( x[i]<=k && y[i]>=k )
            {
                c++;
            }
        }
        System.out.println(c);
    }
}