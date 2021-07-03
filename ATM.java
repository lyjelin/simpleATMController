import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.util.*;


import java.text.SimpleDateFormat;

public class ATM {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        
        User user = new User();
        Deposit deposit = new Deposit();
        Withdrawal withdrawal = new Withdrawal();
        authPinNum authentication = new authPinNum();

        /**
         * Registered User Settings
         */
        addRegisteredUser setting = new addRegisteredUser();
        setting.database(user);
        

        System.out.println("Today is "+Now());
        System.out.println("Please insert your card");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String cardNumber = input.readLine();

        if (authentication.authFunc(input, user, cardNumber) == true){
            String command = "";

            int clientNum = user.getUserIndexByCardNum(cardNumber);

            System.out.println("");
            System.out.println(" Select Transaction");
            System.out.println("---------------------");
            System.out.println("[1] Check Balance \n[2] Cash Deposit \n[3] Cash Withdrawal");
            System.out.println("");
            System.out.println("Please enter your command : ");

            try {
                command = input.readLine();
            } catch (IOException e) {
                System.out.print("Wrong command. Please try again");
            }

            while (!command.equals("0")){
                if (command.equals("1"))
                    user.getAccBalance(clientNum);

                else if (command.equals("2"))
                    deposit.func(input, user, cardNumber);
                else if (command.equals("3"))
                    withdrawal.func(input, user, cardNumber);

            }

            System.out.println("Please remember to retrieve your card");
            System.out.println("Thank you for using");

        }

    
    }

    public static String Now(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm");

        String timeStamp = date.format(new Date());
        
        return timeStamp;
    }

}
