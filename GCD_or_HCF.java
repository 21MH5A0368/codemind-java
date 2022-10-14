import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,b,min=0;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if(a<b)
            min=a;
        else
            min=b;
        for(i=min;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}