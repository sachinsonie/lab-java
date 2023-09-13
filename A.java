public interface a {
    // Fields in interfaces are implicitly public, static, and final
    int num = 6;

    void show();
}

class b implements a {
    public void show() {
        System.out.println("in show");
    }
}


    public static void main(String[] args) {
        // Accessing the num field using the interface name
        System.out.println(a.num);
        a obj = new b();
        obj.show();
    }
 
