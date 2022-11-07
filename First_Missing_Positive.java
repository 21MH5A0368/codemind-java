import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,x[],n,j,a=1,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0; ;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a==x[j])
                {
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                System.out.println(a);
                break;
            }
            else
            {
                a++;
                found=0;
            }
        }
    }
}