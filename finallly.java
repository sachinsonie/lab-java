import java.security.KeyManagementException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.synth.SynthIcon;
class Demo
{
    public void a() throws Exception
    {
    //     try {
            b();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("error" + e);
        // }
    }
    public void b() throws Exception
    {
        int num1 = 8;
        int num2 = 0;
         try{
            if(num2 < 0)
            {
                Exception e = new ArithmeticException();
                thorw e;
            }
            int result = num1 / num2;
            System.out.println(result);
         }
        catch(Exception e)
        {
            System.out.println("error" + e.getMessage());
        }

    }
}
public class finallly {
    public static void main(String[] args) {
    Demo obj = new Demo();
    try {
        
        obj.a();   
    } catch (Exception e) {
        System.out.println("errorrr");
        // TODO: handle exception
    }
    }
}
