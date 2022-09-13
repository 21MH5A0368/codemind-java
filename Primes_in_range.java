import java.util.Scanner;
class sample
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
		int m,n,i,c=0;
		m=sc.nextInt();
		n=sc.nextInt();
		if( m==1 || m==0)
		    m=2;
		for(i=m;i<=n;i++)
		{
		    if(isprime(i))
		    {
		        c++;
		    }
		}
		System.out.println(c);
	}
}