import java.util.Scanner;
class sample
{
    public static boolean isugly(int n)
    {
        if(n<1)
            return false;
        int found=0;
        while(n>1)
        {
            found=0;
            if(n%5==0)
            {
                n=n/5;
                found=1;
            }
            if(n%3==0)
            {
                n=n/3;
                found=1;
            }
            if(n%2==0)
            {
                n=n/2;
                found=1;
            }
            if( n==1 || found==0 )
            {
                break;
            }
        }
        if(n>1)
            return false;
        else
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(isugly(n))
            System.out.println("Ugly Number");
        else
            System.out.println("Not Ugly Number");
    }
}