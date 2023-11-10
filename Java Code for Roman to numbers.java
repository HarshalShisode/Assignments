// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.next();
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1&&mp.get(str.charAt(i))<mp.get(str.charAt(i+1))){
                ans+=mp.get(str.charAt(i+1))-mp.get(str.charAt(i));
                i++;
            }else{
                ans+=mp.get(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
