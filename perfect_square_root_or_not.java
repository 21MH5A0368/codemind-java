import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double d;
        n=sc.nextInt();
        sc.close();
        d=Math.sqrt(n);
        if(d-(int)d>0)
            System.out.println("False");
        else
            System.out.println("True");
    }
}