import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,x[],n,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(x[i]%2==0 && i%2==0)
            {
                count++;
            }
            if(x[i]%2==0)
            {
                c++;
            }
        }
        if(c==count)
            System.out.println("True");
        else
            System.out.println("False");
    }
}