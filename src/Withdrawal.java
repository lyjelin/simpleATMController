import java.io.BufferedReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Withdrawal {

    public static void func(BufferedReader input, User u, int clientAccIndex, int clientNum) throws IOException, NoSuchAlgorithmException {

        System.out.println("");
        System.out.println("Enter amount for cash withdrawal : ");

        String amount = input.readLine();

        System.out.println("");
        System.out.println("Amount entered : "+amount);
        System.out.println("Are you confirmed? Y/N");

        String confirmation = input.readLine();
        boolean flag = true;

        while(flag == true){
            if (confirmation.equals("Y") || confirmation.equals("y")){
                int currentBalance = u.getAccBalance(clientNum).get(clientAccIndex);
                u.getAccBalance(clientNum).set(clientAccIndex, currentBalance - Integer.parseInt(amount));
                System.out.println("");
                System.out.println("=======================");
                System.out.println(Integer.parseInt(amount)+" withdrawn into your account ["+u.getAcc().get(clientNum).get(clientAccIndex)+"] successfully");
                System.out.println("Current Balance : "+ (currentBalance - Integer.parseInt(amount)));
                System.out.println("");
                System.out.println("Returning back to Transaction Main ...");
                flag = false;
            }
            else if (confirmation.equals("N") || confirmation.equals("n")){
                System.out.println("");
                System.out.println("=======================");
                System.out.println("Cash Withdrawal Cancelled");
                System.out.println("Returning back to Transaction Main ...");
                flag = false;
    
            }
            else {
                System.out.println("");
                System.out.println("=======================");
                System.out.println("Invalid input");
                System.out.println("Please enter either Y or N");
                confirmation = input.readLine();

            }

        }

        return;

    }

}
