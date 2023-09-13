class AA
{
    public void show()
    {
        System.out.println("in show");
    }

    static class BB
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}
public class innerDemo {
    public static void main(String[] args) {
        AA s = new AA();
        AA.BB ss = new AA.BB();
        s.show();
        ss.display();
    }
}
