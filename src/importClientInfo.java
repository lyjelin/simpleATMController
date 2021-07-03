import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.io.*;

public class importClientInfo extends HashAlgo {

    public importClientInfo(){}

    public void database(User u) throws NoSuchAlgorithmException, IOException {

        File clientInfoFile = new File("clientDB.txt");
        FileReader fr = new FileReader(clientInfoFile);
        BufferedReader br = new BufferedReader(fr);

        String clientInfo;

        while ((clientInfo = br.readLine())!=null){      
            String[] tempArray = clientInfo.split(";");

            ArrayList<String> acc = new ArrayList<String>();
            ArrayList<Integer> accBalance= new ArrayList<Integer>();

            u.addName(tempArray[0]);
            u.addCardNum(tempArray[1]);
            u.addnormPin(tempArray[2]);
            u.addhashedPin(hashedPin(tempArray[2]));

            String[] accHoldByClient = (tempArray[3]).split(",");
            for (String x : accHoldByClient){
                acc.add(x);
            }
            String[] eachAccBalance = (tempArray[4]).split(",");
            for (String x : eachAccBalance){
                accBalance.add(Integer.parseInt(x));
            }
            u.addAccNum(acc);
            u.addAccBalance(accBalance);

            u.addLoginStatus(Boolean.parseBoolean(tempArray[5]));
            u.addLoginFailCount(Integer.parseInt(tempArray[6]));
            
        }

        br.close();

    }
}