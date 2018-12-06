import java.util.TreeSet;

public class Tree {

   public static void main(String args[]) {

        TreeSet<MyClass> tree = new TreeSet<MyClass>();

        tree.add(new MyClass("labelka jeden", "333"));
        tree.add(new MyClass("labelka dwa", "222"));
        tree.add(new MyClass("label trzy", "555"));
       System.out.println(tree);
        tree.forEach(m -> System.out.println(m.label+"\t\t"+m.value));


    }
}

