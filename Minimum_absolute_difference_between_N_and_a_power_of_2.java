import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p,i,left;
        sc.close();
        for(i=0; ;i++){
            p=(int)Math.pow(2,i);
            if(n<=p){
                left=(int)Math.pow(2,i-1);
                break;
            }
        }
        if(n==p)
            System.out.println("0");
        else if((n-left)>(p-n))
            System.out.println(p-n);
        else
            System.out.println(n-left);
    }
}
