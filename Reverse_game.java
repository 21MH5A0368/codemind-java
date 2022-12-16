import java.util.Scanner;
class sample
{
    public static int ispalindrome(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum*10+n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            System.out.print(ispalindrome(x[i])+" ");
        }
    }
}