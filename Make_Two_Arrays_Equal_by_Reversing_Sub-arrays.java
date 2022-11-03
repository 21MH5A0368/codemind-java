import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],y[],m,n,i,j,count=0;
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
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(x[i]==y[j])
                {
                    count++;
                    y[j]=-999999;
                    break;
                }
            }
        }
        if(count==n)
            System.out.println("True");
        else
            System.out.println("False");
    }
}