import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,m,x[],i,count=0,k,j;
        T=sc.nextInt();
        while(T-->0){
            m=sc.nextInt();
            x=new int[m];
            for(i=0;i<m;i++){
                x[i]=sc.nextInt();
            }
            for(i=0;i<m;i++){
                for(j=i+1;j<m;j++){
                    for(k=0;k<m;k++){
                        if(x[i]+x[j]==x[k])
                        {
                            count++;
                        }
                    }
                }
            }
            if(count>0)
                System.out.println(count);
            else
                System.out.println("-1");
            count=0;
        }
    }
}