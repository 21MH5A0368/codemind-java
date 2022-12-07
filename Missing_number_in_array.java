import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,m,x[],i,count=0,k,j,found=0;
        T=sc.nextInt();
        while(T-->0){
            found=0;
            m=sc.nextInt();
            x=new int[m];
            for(i=0;i<m-1;i++){
                x[i]=sc.nextInt();
            }
            for(i=m;i>0;i--){
                for(j=m-1-1;j>=0;j--){
                    if(i==x[j])
                    {
                        found=0;
                        break;
                    }
                    found=1;
                }
                if(found==1){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}