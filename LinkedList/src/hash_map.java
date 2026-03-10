import java.util.HashMap;
import java.util.Map;
public class hash_map {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        String s="abcdefghijklmnopqrstuvwxyz";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,i);
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
