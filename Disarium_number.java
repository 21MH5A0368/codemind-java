import java.util.Scanner;
class sample
{
    public static boolean isdisarium (int n)
    {
        int d,sum=0,temp=n;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            sum+=Math.pow(n%10,d);
            d--;
            n/=10;
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
        if(isdisarium(n))
            System.out.println("True");
        else
            System.out.println("False");
    }
}