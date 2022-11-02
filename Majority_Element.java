import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,j,max=0,count=1;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++){
            if(x[i]!=-9999){
                for(j=i+1;j<n;j++)
                {
                    if(x[i]==x[j] & i!=j)
                    {
                        count++;
                        x[j]=-9999;
                    }
                }
                if(count>n/2 && x[i]>max)
                {
                    max=x[i];
                    count=1;
                }
            }
        }
        System.out.println(max);
    }
}