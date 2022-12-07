import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,x[][],i,j,sum=0;
        m=sc.nextInt();
        n=sc.nextInt();
        x=new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                x[i][j]=sc.nextInt();
                sum+=x[i][j];
            }
        }
        sc.close();
        System.out.println(sum);
    }
}