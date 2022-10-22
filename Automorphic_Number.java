import java.util.Scanner;
class sample
{
    public static boolean isautomorphic(int n)
    {
        int d,s,r;
        d=(int)Math.log10(n)+1;
        s=n*n;
        r=s%(int)Math.pow(10,d);
        if(r==n)
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
        if(isautomorphic(n))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
    }
}