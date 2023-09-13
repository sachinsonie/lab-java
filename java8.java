interface A
{
    void show();
   default void config(){
        System.out.println("this is config method");
    }
   static void abc(){
        System.out.println("in abc");
    }
}
class b implements A
{
    public void show(){
        System.out.println("in show");
    }
}
public class java8 {
    public static void main(String[] args) {
        A.abc();
        A obj = new b();
        obj.config();
    }
}
