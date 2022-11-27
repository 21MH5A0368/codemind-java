import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,n,x[],i,j,count,found=1;
        T=sc.nextInt();
        while(T-->0)
        {
            count=0;
            n=sc.nextInt();
            x=new int[n];
            for(i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            for(i=0;i<n;i++){
                for(j=i-1;j>=0;j--){
                    if(x[i]>x[j]){
                        found=0;
                        break;
                    }
                }
                if(found==1){
                    count++;
                }
                found=1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}