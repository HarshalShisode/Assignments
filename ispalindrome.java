// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        boolean ip=isPangram(str);
        if(ip){
            System.out.println("The input is pangram");
        }else{
            System.out.println("The input is not pangram");
        }
    }
    public static boolean isPangram(String str){
        boolean[] alpha=new boolean[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                alpha[ch-'a']=true;
            }
        }
        for(boolean pres:alpha){
            if(!pres) return false;
        }
        return true;
    }
}
