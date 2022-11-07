import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,x[],n,a,found=0,s=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        a=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if(a==x[i])
            {
                found=1;
                s=i;
                break;
            }
        }
        for(i=n-1;i>=s;i--)
        {
            if(a==x[i])
            {
                found=1;
                System.out.print(s+" "+i);
                break;
            }
        }
        if(found==0)
        {
            System.out.println("-1 -1");
        }
    }
}