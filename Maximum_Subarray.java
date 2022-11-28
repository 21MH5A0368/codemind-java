import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,sum,max;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        sc.close();
        sum=x[0];
        max=x[0];
        for(i=1;i<n;i++){
            if(sum<0){
                sum=x[i];
            }else{
                sum+=x[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
