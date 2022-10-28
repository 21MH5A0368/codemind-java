import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=1,x[],n,found=0,found1=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n-1;i++)
        {
            if(((found1==0 && x[i]<x[i+1] && i%2==0 )||( x[i]>x[i+1] && i%2!=0 )))
            {
                count++;
                found=1;
            }
            if((found==0 && ( x[i]>x[i+1] && i%2==0 ) || ( x[i]<x[i+1] && i%2!=0 )))
            {
                count++;
                found1=1;
            }
        }
        if(count==n)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}