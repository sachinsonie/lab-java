import java.util.ArrayList;
import java.util.Collections;

public class collectionn {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<String> a = new ArrayList<String>();
        a.add("pw");
        a.add("hyder");
        a.add("java");
        a.add("rohan");
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(10);
        a2.add(20);
        a2.add(20);
        a2.add(20);
        a2.add(30);
        a2.add(40);
        System.out.println(a);
        int index = Collections.binarySearch(a2,30);
        System.out.println(index);

        Collections.rotate(a2, 3);
        System.out.println(a2);

        Collections.shuffle(a2);
        System.out.println(a2);

      System.out.println(Collections.frequency(a2,20));

    }
}
