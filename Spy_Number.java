import java.util.Scanner;
class spy
{
	public static int digitsprod(int n)
	{
		int r,prod=1;
		while(n>0)
		{
			r=n%10;
			prod=prod*r;
			n=n/10;
		}
		return prod;
	}
	public static int digitssum(int n)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
      { 
		Scanner sc=new Scanner(System.in);
	 	int n,res1,res2;
	 	n=sc.nextInt();
		res1=digitsprod(n);
		res2=digitssum(n);
		if(res1==res2)
			System.out.println("Spy Number");
		else
			System.out.println("Not Spy Number");
		sc.close();
	}
}
		