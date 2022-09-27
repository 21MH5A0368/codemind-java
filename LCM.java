import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max,a,b,lcm,i;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if(a>b)
            max=a;
        else
            max=b;
        for(i=max; ;i++)
        {
            if( i%a==0 && i%b==0 )
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}