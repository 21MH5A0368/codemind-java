import java.util.Scanner;
class sample
{
    public static boolean ispalindrome (int n)
    {
        int temp=n,sum=0,i,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
    public static int isreverse (int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        for(int i=0; ;i++)
        {
            x=x+isreverse(x);
            if(ispalindrome(x))
                break;
        }
        System.out.println(x);
        sc.close();
    }
}