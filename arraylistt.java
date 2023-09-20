import java.util.ArrayList;

public class arraylistt {
    public static void main(String[] args) 
    {
        System.out.println("--------------------------------------");

        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(200);
        System.out.println(al1);
        System.out.println("--------------------------------------");

        ArrayList al2 = new ArrayList();
        al2.add("pw skills");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);
        al2.add(199);
        System.out.println(al2);
        System.out.println("--------------------------------------");

        ArrayList al3 = new ArrayList();
        al3.add(3);
        al3.add("hello");
        al3.addAll(al1);
        System.out.println(al3);
        al3.add(2,"world");
        System.out.println(al3);
    }
}
