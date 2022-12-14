import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,es=0,os=0,i,d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                es=es+x[i];
            }
            else
            {
                os=os+x[i];
            }
        }
        d=Math.abs(es-os);
        System.out.print(d);
    }
}