import java.util.Scanner;
class sample
{
	public static boolean isprime(int n)
	{
	    if(n<2)
	        return false;
		int count=0;
		for(int i=2;i*i<=n;i++)
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
		int n,i,a,b;
		n=sc.nextInt();
		sc.close();
		if(isprime(n))
		{
		    System.out.println("0");
		    System.exit(0);
		}
		for(i=n+1; ;i++)
		{
		    if(isprime(i))
		    {
		        b=i;
		        break;
		    }
		}
		for(i=n-1; ;i--)
		{
		    if(isprime(i))
		    {
		        a=i;
		        break;
		    }
		}
		if((n-a)>=(b-n))
		{
		    System.out.println(b-n);
		}
		else if((n-a)<(b-n))
		{
		    System.out.println(n-a);
		}
	}
}