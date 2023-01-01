import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),x[]=str.split(" ");
        int i,j;
        sc.close();
        for(i=x.length-1;i>=0;i--){
            System.out.print(x[i]+" ");
        }
    }
}