public class FirstCharacterCapital {
    public static void main(String[] args) {
        String s = "ronaldo is better than messi";
        boolean check = true;
//        char uc;
        char c;
        String ans = "";
        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
//            uc = c;
            if (check){
                c = Character.toUpperCase(c);
                check=false;
            }
            ans += c;
            if (c==' ') {
                check = true;
            }
            else{
                check=false;
            }

        }
        System.out.println(ans);
    }
}
