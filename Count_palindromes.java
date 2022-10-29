import java.util.Scanner;
class sample
{
    public static boolean ispalindrome(int n)
    {
        int d,x,y;
        while(n>0)
        {
            d=(int)Math.log10(n)+1;
            x=n%10;
            y=n/(int)Math.pow(10,d-1);
            if(x!=y)
            {
                return false;
            }
            n=n%(int)Math.pow(10,d-1);
            n=n/10;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(ispalindrome(x[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}