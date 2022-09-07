import java.util.Scanner;
class nthprime
{
	public static boolean isprime(int n)
	{
		int count=0;
		for(int i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		if(n==1)
		    n=2;
		for(i=n;i<=m;i++)
		{
			if(isprime(i))
			{
			    System.out.println(i);
			}
		}
		sc.close();
	}
}