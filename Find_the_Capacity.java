import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b,c,d;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        c=(2*t*s*b*512)/1024;
        System.out.println(c+"KB");
    }
}