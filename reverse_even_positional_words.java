import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),x[]=str.split(" ");
        int i,j;
        sc.close();
        for(i=0;i<x.length;i++){
            if(i%2!=0)
            {
                System.out.print(x[i]+" ");
            }
            else{
                for(j=x[i].length()-1;j>=0;j--)
                {
                    char ch=x[i].charAt(j);
                    System.out.print(ch);
                }
                System.out.print(" ");
            }
        }
    }
}