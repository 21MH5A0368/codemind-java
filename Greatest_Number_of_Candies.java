import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],c,i,g=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        c=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]>g)
            {
                g=x[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(x[i]+c>=g)
                System.out.print("True ");
            else
                System.out.print("False ");
        }
    }
}