import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        int S,p;
        c=sc.nextInt();
       // sc.close();
        float A,s;
        s=(float)(a+b+c)/2;
      //  p=(float)s*(s-a)*(s-b)*(s-c);
        A=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",A);
    }
}