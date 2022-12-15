import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,x[],n,c=0,o=0,e=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(x[i]%2==0)
            {
               e++; 
            }
            else
            {
                o++;
            }
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(x[j]!=-999)
                {
                    if(x[j]%2==0 && ( c%2==0 || o==0))
                    {
                        System.out.print(x[j]+" ");
                        c++;
                        e--;
                        x[j]=-999;
                        break;
                    }
                    if(x[j]%2!=0 && ( c%2!=0 || e==0 ))
                    {
                        System.out.print(x[j]+" ");
                        c++;
                        o--;
                        x[j]=-999;
                        break;
                    }
                }
            }
        }
        if(n%2!=0)
            System.out.println("0");
    }
}