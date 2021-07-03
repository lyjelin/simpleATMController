import java.io.*;

public class exportClientInto {

    public void save(User u) throws FileNotFoundException{
        PrintWriter dbFile = new PrintWriter("clientDB.txt");

        String clientInfo = "";

        for (int i=0;i<u.nameArraySize();i++){
            clientInfo = 
                u.getName(i)+";"+u.getCardNum(i)
                + ";"+u.gethashedPin(i)+";";
            if (u.getAcc().get(i).size()>1){
                for (int j=0;j<u.getAcc().size();j++){
                    if (j!=u.getAcc().size()-1){
                        clientInfo += u.getAcc().get(j)+",";
                    }
                    else {
                        clientInfo += u.getAcc().get(j);
                    }
                }
            }
            else {
                clientInfo += u.getAcc().get(i);
            }
            clientInfo += ";";

            if (u.getAccBalance(i).size()>1){
                for (int j=0;j<u.getAccBalance(i).size();j++){
                    if (j!=u.getAccBalance(i).size()-1){
                        clientInfo += u.getAccBalance(i).get(j)+",";
                    }
                    else {
                        clientInfo += u.getAccBalance(i).get(j);
                    }
                }
            }
            else {
                clientInfo += u.getAccBalance(i).get(i);
            }
            clientInfo += ";"+u.getLoginStatus(i)+";"+u.getLoginFailCountByIndex(i)+"\n";

            dbFile.println(clientInfo);
            dbFile.close();
            
        }



    }
    
}
