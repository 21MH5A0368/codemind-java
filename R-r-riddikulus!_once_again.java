import java.util.Scanner;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x[],i,temp,n,T;
        n=sc.nextInt();
        T=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        sc.close();
        while(T-->0)
        {
            temp=x[0];
            for(i=0;i<n-1;i++){
                x[i]=x[i+1];
            }
            x[n-1]=temp;
        }
        for(i=0;i<n;i++){
        System.out.print(x[i]+" ");
        }
    }
}