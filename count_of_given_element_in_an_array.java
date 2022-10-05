import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,z,c=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        z=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++)
        {
            if(z==x[i])
            {
              c++;
            }
        }
        System.out.println(c);
    }
}