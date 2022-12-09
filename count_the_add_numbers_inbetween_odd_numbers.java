import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=1;i<n-1;i++)
        {
            if( x[i-1]%2!=0 && x[i]%2!=0 && x[i+1]%2!=0 )
            {
                c++;
            }
        }
        System.out.print(c);
    }
}