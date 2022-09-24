import java.util.Scanner;
class sample
{
    public static int issum(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        sc.close();
        while(n>0)
        {
            d=(int)Math.log10(issum(n))+1;
            if(d==1)
                break;
            else
                n=issum(n);
        }
        System.out.println(issum(n));
    }
}