import java.util.Scanner;
class sample
{
    public static boolean isunique(int n)
    {
        int temp=n,fn=n,r,r1,count=0,d;
        d=(int)Math.log10(n)+1;
        while(n>0)
        {
            r=n%10;
            while(temp>0)
            {
                r1=temp%10;
                if(r==r1)
                {
                    count++;
                }
                temp=temp/10;
            }
            temp=fn;
            n=n/10;
        }
        if(count==d)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(isunique(n))
            System.out.println("Unique Number");
        else
            System.out.println("Not Unique Number");
    }
}