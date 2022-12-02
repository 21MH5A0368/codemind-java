import java.util.Scanner;
class sample
{
    public static int isamicable(int n)
    {
        int i,sum=0;
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        sc.close();
        if(isamicable(n)==m && isamicable(m)==n)
            System.out.println("Amicable");
        else
            System.out.println("Not Amicable");
    }
}