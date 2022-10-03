import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,sum=0,n,k;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        sc.close();
        for(i=0;i<k;i++)
        {
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}