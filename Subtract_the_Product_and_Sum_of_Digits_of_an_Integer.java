import java.util.Scanner;
class sample
{
    public static int isprod (int n)
    {
        int prod=1;
        while(n>0)
        {
            prod=prod*(n%10);
            n=n/10;
        }
        return prod;
    }
    public static int issum (int n)
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
        int n,res;
        n=sc.nextInt();
        res=isprod(n)-issum(n);
        System.out.println(res);
        sc.close();
    }
    
}