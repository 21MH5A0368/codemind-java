import java.util.*;
class sample
{
    public static int isreverse(int n)
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
        int n,r;
        n=sc.nextInt();
        sc.close();
        r=isreverse(n);
        System.out.println(r);
    }
}