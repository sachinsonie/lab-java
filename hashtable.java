import java.util.Hashtable;
import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"rohit");
        ht.put(2,"sachin");
        ht.put(3,"soni");
        // ht.put(null, "hyder");
        ht.putIfAbsent(1, "soni");

        System.out.println(ht);
        
        TreeMap tm = new TreeMap();
        
        Integer i = new Integer(4);

        tm.put(i,"hello:");
        tm.put(1,"ramesh:");
        tm.put(4,"rahul");
        tm.put(3,"rohan");

        System.out.println(tm);
        

    }
}
