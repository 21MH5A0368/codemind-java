import java.util.Scanner;
class sample{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       for(i=n;i>0;i--){
           for(j=1;j<=n-2;j++){
               System.out.print(j);
           }
           for(j=n-3;j>0;j--){
               System.out.print(j);
           }
           System.out.println();
       }
    }
}