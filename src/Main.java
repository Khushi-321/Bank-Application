import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name, balance and password to create an account");
        Scanner sc= new Scanner(System.in);
        // created user
        String name=sc.next();
        double balance=sc.nextDouble();
        String password=sc.next();
        SBIUser user= new SBIUser(name,balance,password);

        // add money
        String message=user.addMoney(100000);
        System.out.println(message);

        // withdraw money
        System.out.println("Enter amount you want to withdraw");
        int money=sc.nextInt();
        System.out.println("Enter password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));
        // rate of interest
        System.out.println("Enter no. of years");
        int years=sc.nextInt();
        System.out.println(user.calculateInterest(years));
    }
}