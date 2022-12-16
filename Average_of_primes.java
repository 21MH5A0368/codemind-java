import java.util.Scanner;
class sample
{
	public static boolean isprime(int n)
	{
	    if(n<2)
	        return false;
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
        int i,j,x[],n,c=0;
        float avg,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                c++;
                sum+=x[i];
            }
        }
        avg=sum/c;
        System.out.format("%.2f",avg);
	}
}