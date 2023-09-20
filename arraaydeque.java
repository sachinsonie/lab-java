import java.util.*;
public class arraaydeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque<>();
        ad1.add(1010);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(3);
        ad1.addLast('j');
        ad1.add(3);
        System.out.println(ad1);
        ad1.offer(500);
        ad1.offerLast(10);
        System.out.println(ad1);
    }
}
