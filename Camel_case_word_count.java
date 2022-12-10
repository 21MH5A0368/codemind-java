import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int word_count=0,i;
	    sc.close();
	    for(i=0;i<str.length();i++)
	    {
	        char ch=str.charAt(i);
	        if((ch>=65 && ch<=90) || i==0 )
	        {
	            word_count++;
	        }
	    }
        System.out.println(word_count);
    }
}