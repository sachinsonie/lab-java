@FunctionalInterface
interface Car
{
    void drive(int avg, int ts);
}
// class Wagon implements Car
// {
//     public void drive(){
//         System.out.println("driving");
//     }
// }
public class lambaa {
    public static void main(String[] args) {
        Car obj = (avg,ts) -> System.out.println("drivingggg" + " " + avg +" " +ts) ;
        
        obj.drive(16,66);
    }
}
