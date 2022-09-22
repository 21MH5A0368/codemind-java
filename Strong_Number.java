import java.util.Scanner;
class sample
{
    public static int isfact (int n)
    {
        int fact=1,i;
        for(i=n;i>0;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isfs (int n)
    {
        int sum=0,temp=n,r,f;
        while(n>0)
        {
            r=n%10;
            f=isfact(r);
            sum=sum+f;
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
        if(isfs(n))
            System.out.println("The number "+n+" is a strong number");
        else
            System.out.println("The number "+n+" is not a strong number");
    }
}