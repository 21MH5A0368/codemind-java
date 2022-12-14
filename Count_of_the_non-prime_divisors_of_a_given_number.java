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
		int n,i,c=0;
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
		    if(n%i==0 && !isprime(i))
		    {
		        c++;
		    }
		}
	    System.out.println(c);
	}
}