import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n;
        n=sc.nextInt();
        sc.close();
        c=a+b;
        for(int i=0; ;i++)
        {
            a=b;
            b=c;
            c=a+b;
            if( c>n )
                break;
        }
        if((c-n)==(n-b))
            System.out.println(b+" "+c);
        else if((c-n)<(n-b))
            System.out.println(c);
        else
            System.out.println(b);
    }
}