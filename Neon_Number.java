import java.util.Scanner;
class sample
{
    public static boolean isneon(int n)
    {
        int temp=n,r,sum=0;
        n=n*n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(isneon(n))
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}