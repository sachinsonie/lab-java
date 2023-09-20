import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
class Gen<T>
{
    T obj;
    public Gen(T obj)

    {
        this.obj = obj;
    }
    
        public T getObj()
        {
            return obj;
        }
    }

public class genrics
{
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        Collection<Integer> list3 = new ArrayList<Integer>();
        List<String> list4 = new ArrayList<String>();
        List<Integer> list5 = new ArrayList<Integer>();
        // List<Integer> list5 = new ArrayList<Integer>();
        System.out.println();
    }
}