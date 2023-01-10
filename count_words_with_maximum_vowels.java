import java.util.Scanner;
class sample{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int vc=0,max=0,count=0;
        String s=sc.nextLine();
        sc.close();
        String v="AEIOUaeiou";
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(v.contains(words[i].charAt(j)+"")){
                    vc++;
                }
            }
            if(vc>max){
                max=vc;
            }
            vc=0;
        }
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(v.contains(words[i].charAt(j)+"")){
                    vc++;
                }
            }
            if(vc==max){
                count++;;
            }
            vc=0;
        }
        System.out.print(count);
    }
}