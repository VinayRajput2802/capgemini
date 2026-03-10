public class second {
    public static void main(String[] args) {
        Space sp = str -> String.join(" ", str.split(""));
        System.out.println(sp.space("CD"));
    }
}

interface Space{
    String space(String a);
}