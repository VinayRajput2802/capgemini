import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Integer> root = new TreeSet<>();
        root.add(5);
        root.add(4);
        root.add(3);
        root.add(2);
        root.add(1);
        System.out.println(root);
    }
}
