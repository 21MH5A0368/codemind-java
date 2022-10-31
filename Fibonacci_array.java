import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        if(n<=2)
        {
            System.out.println("no");
            System.exit(0);
        }
        for(i=2;i<n;i++)
        {
            if(x[i]!=(x[i-1]+x[i-2]))
            {
               System.out.println("no");
               System.exit(0);
            }
        }
        System.out.println("yes");
    }
}