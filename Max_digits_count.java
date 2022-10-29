import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,count=0,d,dit,max=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            d=(int)Math.log10(x[i])+1;
            if(d>max)
            {
                max=d;
            }
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            dit=(int)Math.log10(x[i])+1;
            if(dit==max)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}