import java.util.*;
class Solution{
	public static void main(String []ar){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=0,y=1;
		System.out.print(x+" "+y+" ");
		for(int i=2;i<n;i++){
			int sum=x+y;
			x=y;
			y=sum;
			System.out.print(sum+" ");
		}
	}
}