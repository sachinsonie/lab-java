import java.util.Scanner;

public class AtmExample{
    public static void main(String[] args) {
        
        int balance = 30000;
        int withdraw = 0;
        int deposite = 0;

        Scanner sc = new Scanner(System.in);
        
      while(true){
        System.out.println("-----WELCOME TO ATM MACHINE-----");
        System.out.println("---------------------------------------");
        System.out.println("OPTION 1 : WITHDRAW");
        System.out.println("OPTION 2 : DEPOSITE");
        System.out.println("OPTION 3 : CHECK BALANCE");
        System.out.println("OPTION 4: EXIT");
        System.out.println("CHOOSE ANYONE OPTION ABOVE:---------");

        int option = sc.nextInt();
        switch(option){
            case 1:
            System.out.println("enter withdraw amount");
            withdraw = sc.nextInt();
            if(withdraw>balance)
            {
                System.out.println("insufficient balance");
                System.out.println("----------------------------------------------");
            } 
            else{
                balance = balance-withdraw;
                System.out.println("succesfully withdrawn");
                System.out.println("----------------------------------------------");
                break;
            }
            case 2:
            System.out.println("enter deposite amount");
            deposite = sc.nextInt();
            balance = deposite + balance;
            System.out.println("succesfully deposited");
            System.out.println("----------------------------------------------");
            break;
            
            case 3: 
            System.out.println("your account balance is: " + balance);
            break;
        

            case 4:
            System.out.println("terminated");
            System.exit(0);
            break;

            default:
            System.out.println("enter valid Option");


        }
      }

    }
}