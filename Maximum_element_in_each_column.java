import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[][],n,m,i,j,max=0;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                x[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                max=Math.max(max,x[j][i]);
            }
            System.out.println(max);
            max=0;
        }
    }
}