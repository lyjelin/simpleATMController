import java.security.*;

public class HashAlgo implements Hashing {

    public HashAlgo(){}
    
    @Override
    public boolean checkPinNum(User u, String pinNum) throws NoSuchAlgorithmException {
        for (String x : u.getHashedPinArray()){
            if (hashedPin(pinNum) == x) return true;
        }
        return false;
    }

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
