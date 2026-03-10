import java.util.HashMap;
import java.util.Scanner;

public class allSameCharacterTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        char c;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        String ans="";
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            int val = hm.get(c);
            while (val>0){
                ans += c;
                val--;
            }
            hm.put(c,0);
        }
        System.out.println(ans);
    }
}
