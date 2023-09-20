import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class fetcharraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(100);
        // System.out.println(a);
        // //for loop
        // for(int i = 0; i<a.size(); i++)
        // {
        //     System.out.println(a.get(i));
        // }

        // //for each
        // for(Object o:a)
        // {
        //     System.out.println(o);
        // }
        Iterator itr =a.iterator();
        while(itr.hasNext())
        {
            Integer i =(Integer)itr.next();
            System.out.println(i);
        }
       ListIterator litr = a.listIterator(a.size());
       while(litr.hasPrevious())
       {
        System.out.println(litr.previous());
       }





    }
}
