import java.util.Scanner;
class sample
{
    public static int isreverse (int n)
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
        int n,sn,r,sr,rsr;
        n=sc.nextInt();
        sn=n*n;
        r=isreverse(n);
        sr=r*r;
        rsr=isreverse(sr);
        if(sn==rsr)
            System.out.println("True");
        else
            System.out.println("False");
    }
}