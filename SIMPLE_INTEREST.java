import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,r,t,s;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        sc.close();
        s=(p*t*r)/100;
        System.out.println(s);
    }
}