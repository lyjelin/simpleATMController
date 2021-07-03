import java.security.NoSuchAlgorithmException;

public interface Hashing {

    public String hashedPin (String input) throws NoSuchAlgorithmException;
    
    public boolean checkUserExistance(User u, String pinNumber);
    
}
