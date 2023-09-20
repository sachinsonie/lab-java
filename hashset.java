import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        h.add(100);
        h.add(20);
        h.add(30);
        h.add(40);
        
        System.out.println(h);

        LinkedHashSet h1 = new     LinkedHashSet<>();
        h1.add(100);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        
        System.out.println(h1);
        
    }
}
