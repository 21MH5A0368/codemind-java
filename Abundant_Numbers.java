import java.util.Scanner;
class sample
{
    public static boolean isabundant (int n)
    {
        int sum=1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum>n)
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
        if(isabundant(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}