public class third {
    public static void main(String[] args) {
        Authentication check = (a, b) -> ("abc".equals(a) && "123".equals(b));
        System.out.println(check.authenticate("abc", "123"));
        System.out.println(check.authenticate("abc", "1234"));
    }
}

@FunctionalInterface
interface Authentication{
    boolean authenticate(String a,String b);
}
