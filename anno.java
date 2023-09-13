interface Car
{
    void drive();
}
// class Wagon implements Car
// {
//     public void drive(){
//         System.out.println("driving");
//     }
// }
public class anno {
    public static void main(String[] args) {
        Car obj = new Car(){
            public void drive()
            {
                System.out.println("drivingggg");
            }
        };
        obj.drive();
    }
}
