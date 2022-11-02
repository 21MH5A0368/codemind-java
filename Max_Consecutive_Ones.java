import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,max=0,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
            x[i]=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++){
            if(x[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
    }
}