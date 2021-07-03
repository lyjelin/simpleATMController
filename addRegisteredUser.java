import java.security.NoSuchAlgorithmException;
import java.util.*;

public class addRegisteredUser extends HashAlgo {

    public addRegisteredUser(){}

    public void database(User u) throws NoSuchAlgorithmException {
        
        /**
         * User 1 - Bear
         */
        ArrayList<String> bearAcc = new ArrayList<String>();
        ArrayList<Integer> bearAccBalance = new ArrayList<Integer>();

        bearAcc.add("0000-00-0000000");
        bearAcc.add("0000-00-0000001");
        bearAccBalance.add(100000);
        bearAccBalance.add(200000);

        u.addName("BEAR");
        u.addCardNum("0000000000000000");
        u.addhashedPin(hashedPin("robotics2017"));
        u.addAccNum(bearAcc);
        u.addAccBalance(bearAccBalance);
        u.addLoginStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 2 - Elin
         */
        ArrayList<String> elinAcc = new ArrayList<String>();
        ArrayList<Integer> elinAccBalance = new ArrayList<Integer>();

        elinAcc.add("0000-00-0000002");
        elinAcc.add("0000-00-0000003");
        elinAccBalance.add(210703);
        elinAccBalance.add(999999);

        u.addName("Elin");
        u.addCardNum("0000000000000001");
        u.addhashedPin(hashedPin("helloworld"));
        u.addAccNum(elinAcc);
        u.addAccBalance(elinAccBalance);
        u.addLoginStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 3 - Panda
         */
        ArrayList<String> pandaAcc = new ArrayList<String>();
        ArrayList<Integer> pandaAccBalance = new ArrayList<Integer>();

        pandaAcc.add("0000-00-0000004");
        pandaAcc.add("0000-00-0000005");
        pandaAccBalance.add(623450);
        pandaAccBalance.add(123905);

        u.addName("Panda");
        u.addCardNum("0000000000000002");
        u.addhashedPin(hashedPin("bamb00"));
        u.addAccNum(pandaAcc);
        u.addAccBalance(pandaAccBalance);
        u.addLoginStatus(true);
        u.addLoginFailCount(0);
        
        /**
         * User 4 - Polar
         */
        ArrayList<String> polarAcc = new ArrayList<String>();
        ArrayList<Integer> polarAccBalance = new ArrayList<Integer>();

        polarAcc.add("0000-00-0000006");
        polarAcc.add("0000-00-0000007");
        polarAccBalance.add(829800);
        polarAccBalance.add(456730);

        u.addName("Polar");
        u.addCardNum("0000000000000003");
        u.addhashedPin(hashedPin("12345!!"));
        u.addAccNum(polarAcc);
        u.addAccBalance(polarAccBalance);
        u.addLoginStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 5 - Pooh
         */
        ArrayList<String> poohAcc = new ArrayList<String>();
        ArrayList<Integer> poohAccBalance = new ArrayList<Integer>();

        poohAcc.add("0000-00-0000008");
        poohAcc.add("0000-00-0000009");
        poohAccBalance.add(500000);
        poohAccBalance.add(750000);

        u.addName("Pooh");
        u.addCardNum("0000000000000004");
        u.addhashedPin(hashedPin("honey33"));
        u.addAccNum(poohAcc);
        u.addAccBalance(poohAccBalance);
        u.addLoginStatus(true);
        u.addLoginFailCount(0);
        
    }
    
}
