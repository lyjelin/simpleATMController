import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;

public class addRegisteredUser extends HashAlgo {

    public addRegisteredUser(){}

    public void database(User u) throws NoSuchAlgorithmException, IOException {

        File clientIntoFile = new File("clientDB.txt");
        FileReader fr = new FileReader(clientIntoFile);
        BufferedReader br = new BufferedReader(fr);

        String clientInfo;

        while ((clientInfo = br.readLine())!=null){
            String[] tempArray = clientInfo.split(";");

            ArrayList<String> acc= new ArrayList<String>();
            ArrayList<Integer> accBalance= new ArrayList<Integer>();

            u.addName(tempArray[0]);
            u.addCardNum(tempArray[1]);

            String[] accHoldByClient = (tempArray[3]).split(",");
            String[] eachAccBalance = (tempArray[4]).split(",");
            if (accHoldByClient.length > 0){
                for (int i=0;i<accHoldByClient.length;i++){
                    acc.add(accHoldByClient[i]);
                    accBalance.add(Integer.parseInt(eachAccBalance[i]));
                }
            }
            u.addAccNum(acc);
            u.addAccBalance(accBalance);

            u.addLoginStatus(Boolean.parseBoolean(tempArray[5]));
            u.addLoginFailCount(Integer.parseInt(tempArray[6]));
        }

        br.close();

    }
}