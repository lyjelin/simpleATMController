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

            String hpin = hashedPin(pinNumber);

            if (!hpin.equals(u.gethashedPin(u.getUserIndex(cardHolderName)))) {
                int userLoginFailCount = u.getLoginFailCount(cardHolderName);
                if (userLoginFailCount < 3){
                    u.failCountUp(u.getUserIndex(cardHolderName));
                }
                else if (userLoginFailCount == 3){
                    u.changeLoginStatus(u.getUserIndex(cardHolderName), false);
                }
                System.out.println("Authentication Fail; Invalid pin number!");
                return false;
            }
            else {
                System.out.println("Authentication Success! Hello "+cardHolderName+"!");
                u.resetCount(u.getUserIndex(cardHolderName));
                return true;
            }
        }
    }
    
}
