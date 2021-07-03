import java.security.NoSuchAlgorithmException;

public interface Hashing {

    public boolean checkPinNum(User u, String PinNum) throws NoSuchAlgorithmException;

    public String hashedPin (String input) throws NoSuchAlgorithmException;
    
    
}
