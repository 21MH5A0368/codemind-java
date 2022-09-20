import java.util.Scanner;
class sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l,w,h,n;
		l=sc.nextInt();
		n=sc.nextInt();
		while(n>0)
		{
		    w=sc.nextInt();
		    h=sc.nextInt();
		    if(w<l || h<l)
		        System.out.println("UPLOAD ANOTHER");
		    else if((w>l && h>l ) || ( w>l || h>l ) )
		    {
		        if(w==h)
		           System.out.println("ACCEPTED");
		       else
		             System.out.println("CROP IT");
		    }
		    else
		        System.out.println("ACCEPTED");
		    n--;
		}
	}
}