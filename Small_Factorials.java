import java.util.Scanner;
class sample
{
    public static int isfact(int n)
    {
        int i,prod=1;
        while(n>0)
        {
            prod=prod*n;
            n--;
        }
        return prod;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T,n,fac;
        T=sc.nextInt();
        while(T>0)
        {
            n=sc.nextInt();
            fac=isfact(n);
            System.out.println(fac);
            T--;
        }
        sc.close();
    }
}