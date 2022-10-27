import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,count=0,x[],n,d=0,y[],m=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if(i%2!=0)
            {
               m+=x[i]; 
            }
        }
        y=new int[m];
        sc.close();
        for(i=0;i<n;i=i+2)
        {
            while(x[i+1]>0)
            {
                y[d++]=x[i];
                x[i+1]--;
            }
        }
        for(i=0;i<d;i++)
        {
            System.out.print(y[i]+" ");
        }
    }
}