import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        sc.close();
        c=a+b;
        System.out.print(a+" "+b+" ");
        while(n>2)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }
    }
}