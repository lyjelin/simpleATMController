import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashAlgo implements Hashing {

    public HashAlgo(){}

    public String hashedPin (String plainPin) throws NoSuchAlgorithmException {
        String generatePin = null;

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(plainPin.getBytes());

        byte[] hashed = md.digest();
        StringBuilder sb = new StringBuilder();

        for (byte b : hashed){
            sb.append(b & 0xff);
        }

        generatePin = sb.toString();

        return generatePin;
    
    }
}
