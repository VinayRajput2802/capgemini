public class palindrome {
    public static void main(String[] args) {
        String s = "MAM";
        int n = s.length();
        int l = 0;
        int r = n-1;
        boolean ans = true;
        while (l<r){
            if (s.charAt(l) != s.charAt(r)){
                ans = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(ans);
    }
}
