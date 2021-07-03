import java.io.*;
import java.security.NoSuchAlgorithmException;

public class authPinNum extends HashAlgo {

    public authPinNum() {}

    public boolean authFunc(BufferedReader input, User u, String cardNumber) throws IOException, NoSuchAlgorithmException {

        String cardHolderName = u.getName(u.getCardNumIndex(cardNumber));

        if (u.checkLoginStatus(cardHolderName) == false){
            System.out.println("Access Failed! Your account has been locked!");
            return false;
        }
        else{

            System.out.println("Please enter your pin number: ");
            String pinNumber = input.readLine();

            while (u.getLoginFailCount(cardHolderName)<3){
                String hpin = hashedPin(pinNumber);

                if (!hpin.equals(u.gethashedPin(u.getUserIndex(cardHolderName)))) {
                    u.failCountUp(u.getUserIndex(cardHolderName));
                    System.out.println("Invalid pin number. Youe login fail count is "+ u.getLoginFailCount(cardHolderName)+" times");
                    System.out.println("");
                }
                
                else {
                    System.out.println("Authentication Success! Hello "+cardHolderName+"!");
                    u.resetCount(u.getUserIndex(cardHolderName));
                    return true;
                }

                System.out.println("Please re-enter your pin number: ");
                pinNumber = input.readLine();
            }
            if (u.getLoginFailCount(cardHolderName) == 3){
                u.changeLoginStatus(u.getUserIndex(cardHolderName), false);
                System.out.println("Authentication Fail. Your Account is locked now");
                return false;
            }
        }
        return false;
    }
}
