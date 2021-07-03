import java.io.*;
import java.security.*;

public class Deposit extends Service {

    @Override
    public void func(BufferedReader input, User u, int clientAccIndex, int clientNum) throws IOException, NoSuchAlgorithmException {
        super.func(input, u, clientAccIndex, clientNum);
        
        System.out.println("");
        System.out.println("Enter amount for cash deposit : ");

        String amount = input.readLine();

        System.out.println("");
        System.out.println("Amount entered is : "+amount);
        System.out.println("Are you confirmed? Y/N");

        String confirmation = input.readLine();
        boolean flag = true;

        while(flag){
            if (confirmation == "Y" || confirmation == "y"){
                int currentBalance = u.getAccBalance(clientNum).get(clientAccIndex);
                u.getAccBalance(clientNum).set(clientAccIndex, currentBalance + Integer.parseInt(amount));
                System.out.println("");
                System.out.println(Integer.parseInt(amount)+" added into your account ["+u.getAcc().get(clientNum).get(clientAccIndex)+"] successfully");
                System.out.println("Current Balance : "+ (currentBalance + Integer.parseInt(amount)));
                System.out.println("");
                System.out.println("Returning back to Transaction Main ...");
                flag = false;
            }
            else if (confirmation == "N" || confirmation == "n"){
                System.out.println("Cash Deposit Cancelled");
                System.out.println("Returning back to Transaction Main ...");
                flag = false;
    
            }
            else {
                System.out.println("Invalid input");
                System.out.println("Please enter either Y or N");

            }

        }

        return;
        
    }
}
