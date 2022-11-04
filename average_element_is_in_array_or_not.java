import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,avg,sum=0,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        avg=(sum/n);
        for(i=0;i<n;i++)
        {
            if(avg==x[i])
            {
              c++;
            }
        }
        if(c!=0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}