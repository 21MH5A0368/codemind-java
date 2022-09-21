import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        float avg;
        avg=(n+m)/(float)2;
        System.out.format("%.4f",avg);
    }
}