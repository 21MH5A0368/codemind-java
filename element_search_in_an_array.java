import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,m,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        m=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if(m==x[i])
            {
              c++;
              break;
            }
        }
        if(c!=0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}