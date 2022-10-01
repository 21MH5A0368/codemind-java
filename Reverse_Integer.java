import java.util.Scanner;
class sample
{
    public static int isreverse(int n)
    {
        int sum=0;
        if(n<0)
            n=-1*n;
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
        int n,a;
        n=sc.nextInt();
        a=isreverse(n);
        if(n<0)
            a=-1*a;
        System.out.println(a);
    }
}