import java.util.Scanner;
class uglynumber
{
    public static boolean isugly (int n)
    {
        if(n<1)
            return false;
        int found=0;
        while(n>0)
        {
            found=0;
            if(n%2==0)
            {
                found=1;
                n=n/2;
            }
            else if(n%3==0)
            {
                found=1;
                n=n/3;
            }
            else if(n%5==0)
            {
                found=1;
                n=n/5;
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
        if(isugly(n))
            System.out.println("Ugly Number");
        else
            System.out.println("Not Ugly Number");
    }
}