import java.util.Scanner;
class sample
{
    public static boolean ispronic(int n)
    {
        int x;
        x=(int)Math.sqrt(n);
        if(x*(x+1)==n)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.close();
        if(ispronic(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}