import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,i,f_max=0,s_max=0,t_max=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++){
            if(x[i]>f_max){
                s_max=f_max;
                f_max=x[i];
            }
            else if(x[i]>s_max){
                t_max=s_max;
                s_max=x[i];
            }
            else if(x[i]>t_max){
                t_max=x[i];
            }
            
        }
        if(t_max!=0){
            System.out.println(t_max);
        }
        else
            System.out.println(f_max);
    }
}