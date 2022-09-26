import java.util.Scanner;
class sample
{
    public static int ishappy (int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        sc.close();
        res=ishappy(n);
        while(n>0)
        {
            if(res>9)
            {
                res=ishappy(res);
            }
            else
                break;
        }
        if( res==1 || res==7 )
            System.out.println("True");
        else
            System.out.println("False");
    }
}