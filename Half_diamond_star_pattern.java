import java.util.Scanner;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n<3){
            System.out.println("The pattern is not possible");
            System.exit(0);
        }
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}