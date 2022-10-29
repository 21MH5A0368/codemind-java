import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,d;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(x[i]==0){
                d=1;
            }
            else if(x[i]<0){
                x[i]=-1*x[i];
                d=(int)Math.log10(x[i])+1;
            }
            else {
                d=(int)Math.log10(x[i])+1;
            }
            System.out.print(d+" ");   
        }
    }
}