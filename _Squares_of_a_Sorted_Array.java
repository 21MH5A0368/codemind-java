import java.util.Scanner;
import java.util.Arrays;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
            x[i]=x[i]*x[i];
        }
        sc.close();
        Arrays.sort(x);
        for(i=0;i<n;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}