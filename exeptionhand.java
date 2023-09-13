class A 
{
    // Syntax, logical, runtime

}
public class exeptionhand {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        int values[] = {4,7,2,9};
        try
        {
            result = num1 / num2; //critical statement exception can occures
            System.out.println(values[4]);
        }
        catch(ArithmeticException e)
        {

            System.out.println("cann't divide by zero" + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(values[values.length-1]);
            System.out.println("stay in limits");
        }
        catch(Exception e_)
        {
            System.out.println("something went wrong");
        }
        System.out.println(result);
        System.out.println("good");
    }
}
