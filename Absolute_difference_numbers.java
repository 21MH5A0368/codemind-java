import java.util.Scanner;
class sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,x,a,b,r,d,c=0;
		n=sc.nextInt();
		x=sc.nextInt();
		int N=n;
		while(n>0)
		{
		    c++;
		    n=n/10;
		}
		a=N%(int)Math.pow(10,x);
        r=c-x;
        b=N/(int)Math.pow(10,r);
        d=(int)Math.abs(a-b);
		System.out.print(d);
		sc.close();
	}
}