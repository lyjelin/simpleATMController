import java.io.*;
import java.security.NoSuchAlgorithmException;

public class authPinNum extends HashAlgo {

    public authPinNum() {}

    public boolean authFunc(BufferedReader input, User u, String cardNumber) throws IOException, NoSuchAlgorithmException {
    
        System.out.println("Please enter your pin number: ");
        String pinNumber = input.readLine();

        if (checkUserExistance(u, pinNumber) == false){
            System.out.print("Unregistered Card!");
            return false;
        }
        else{

            // If card is already registered in database 
            String cardHolderName = u.getName(u.getCardNumIndex(cardNumber));

            if (u.checkAccStatus(cardHolderName) == false){
                System.out.println("Access Failed! Your account has been locked!");
                return false;
            }
            else {
                String hpin = hashedPin(pinNumber);

                if (!hpin.equals(u.gethashedPin(u.gethashedPin(cardHolderName)))) {
                    int userLoginFailCount = u.getLoginFailCount(cardHolderName);
                    if (userLoginFailCount < 3){
                        u.failCountUp(u.getUserIndex(cardHolderName));
                    }
                    else if (userLoginFailCount == 3){
                        u.changeAccStatus(u.getUserIndex(cardHolderName), false);
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
    
}
