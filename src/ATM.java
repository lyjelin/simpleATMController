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
        importClientInfo setting = new importClientInfo();
        setting.database(user);

        System.out.println("=======================");
        System.out.println("                       ");
        System.out.println("Today is " + Now());
        System.out.println("Please insert your card");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String cardNumber = input.readLine();

        if (authentication.authFunc(input, user, cardNumber) == true){
            String command = "";

            int clientNum = user.getCardNumIndex(cardNumber);

            /**
             * Account Selection Page
             */
            System.out.println("");
            System.out.println("=======================");
            System.out.println("Select Account for Service");

            for (int i=0; i<((user.getAcc()).get(clientNum)).size();i++){
                System.out.println(i+" : "+((user.getAcc()).get(clientNum)).get(i));
            }

            String clientInput = input.readLine();
            int clientAccIndex = Integer.parseInt(clientInput);

            System.out.println("");
            System.out.println("Selected Account : "+(user.getAcc()).get(clientNum).get(clientAccIndex));

            /**
             * Transaction Page
             */
            System.out.println("");
            System.out.println("=======================");
            System.out.println("Select Transaction");
            System.out.println("[1] Check Balance \n[2] Cash Deposit \n[3] Cash Withdrawal \n[4] Exit");
            System.out.println("");
            System.out.println("Please enter your command : ");

            try {
                command = input.readLine();
            } catch (IOException e) {
                System.out.println("Wrong command. Please try again");
            }

            while (!command.equals("4")){
                if (command.equals("1"))
                    checkBalance.func(user, clientNum, clientAccIndex);

                if (command.equals("2"))
                    deposit.func(input, user, clientAccIndex, clientNum);

                if (command.equals("3"))
                    withdrawal.func(input, user, clientAccIndex, clientNum);

                System.out.println("");
                System.out.println("=======================");
                System.out.println(" Select Transaction");
                System.out.println("[1] Check Balance \n[2] Cash Deposit \n[3] Cash Withdrawal \n[4] Exit");
                System.out.println("");
                System.out.println("Please enter your command : ");
                command = input.readLine();

            }

            System.out.println("");
            System.out.println("Please remember to retrieve your card");
            System.out.println("Thank you for using");

            exportClientInto clientDB = new exportClientInto();
            clientDB.save(user);

        }

    
    }

    public static String Now(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm");

        String timeStamp = date.format(new Date());
        
        return timeStamp;
    }

}
