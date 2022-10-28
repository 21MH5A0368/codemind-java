import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=1,x[],n,found=0,found1=0,wc=0;
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
            if(found==1 && found1==1)
            {
                System.out.println("-1");
                System.exit(0);
            }
        }
        for(i=2;i<n;i++)
        {
            if( i%2==0 && (found==0 || found1==0))
            {
                wc++;
            }
        }
        if(count==n)
        {
            System.out.println(wc);
        }
        else
            System.out.println("-1");
    }
}