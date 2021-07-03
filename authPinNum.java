import java.io.BufferedReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class authPinNum extends HashAlgo {

    public authPinNum() {}

    public void authFunc(BufferedReader input, User u) throws IOException, NoSuchAlgorithmException {
        System.out.println("Please insert your card: "); 
        String cardNumber = input.readLine();
        
        System.out.println("Please enter your pin number: ");
        String pinNumber = input.readLine();

        if (checkUserExistance(u, pinNumber) == false){
            System.out.print("Unregistered Card!");
            return;
        }
        else{

            // If card is already registered in database 
            String cardHolderName = u.getName(u.getCardNumIndex(cardNumber));

            if (u.checkAccStatus(cardHolderName) == false){
                System.out.println("Access Failed! Your account has been locked!");
                return;
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
                    return;
                }
                else {
                    System.out.println("Authentication Success! Hello "+cardHolderName+"!");
                    u.resetCount(u.getUserIndex(cardHolderName));
                    return;
                }
            }
        }
    }
    
}
