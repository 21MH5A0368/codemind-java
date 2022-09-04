import java.util.Scanner;
class circularprime
{
	public static boolean isprime(int n)
	{
		int i,count=0;
		for(i=2;i<=(int)Math.sqrt(n);i++)
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
	public static int isreverse(int n)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(!isprime(n))
			System.out.println("not prime");
		else if(isprime(isreverse(n)))
			System.out.println("circular prime");
		else
			System.out.println("prime but not a circular prime");
		sc.close();
	}
}