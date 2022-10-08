import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],i,n,Even[],Odd[],j=0,k=0;
        n=sc.nextInt();
        x=new int[n];
        Even=new int[n];
        Odd=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0)
            {
                Even[j++]=x[i];
            }
            else
            {
                Odd[k++]=x[i];
            }
        }
        for(i=0;i<j;i++)
        {
            System.out.print(Even[i]+" ");
        }
        for(i=0;i<k;i++)
        {
            System.out.print(Odd[i]+" ");
        }
    }
}