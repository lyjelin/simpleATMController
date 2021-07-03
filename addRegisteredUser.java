import java.security.NoSuchAlgorithmException;

public class addRegisteredUser extends HashAlgo {

    public addRegisteredUser(){}

    public void database(User u) throws NoSuchAlgorithmException {
        
        /**
         * User 1  
         * name : BEAR
         * cardNum : 0000000000000000
         * hashedPin : hashed(robotics2017)
         * accNum : 0000-00-0000000
         * accBalance : 100000
         * accStatus : true
         * loginFailCount : 0
         */
        u.addName("BEAR");
        u.addCardNum("0000000000000000");
        u.addhashedPin(hashedPin("robotics2017"));
        u.addAccNum("0000-00-0000000");
        u.addAccBalance(100000);
        u.addAccStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 2 
         * name : Elin
         * cardNum : 0000000000000001
         * hashedPin : hashed(helloworld)
         * accNum : 0000-00-0000001
         * acBalance : 210703
         * accStatus : true
         * loginFailCount : 0
         */

        u.addName("Elin");
        u.addCardNum("0000000000000001");
        u.addhashedPin(hashedPin("helloworld"));
        u.addAccNum("0000-00-0000001");
        u.addAccBalance(210703);
        u.addAccStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 3 
         * name : Panda
         * cardNum : 0000000000000002
         * hashedPin : hashed(bamb00)
         * accNum : 0000-00-0000002
         * acBalance : 67000
         * accStatus : true
         * loginFailCount : 0
         */

        u.addName("Panda");
        u.addCardNum("0000000000000002");
        u.addhashedPin(hashedPin("bamb00"));
        u.addAccNum("0000-00-0000002");
        u.addAccBalance(67000);
        u.addAccStatus(true);
        u.addLoginFailCount(0);
        
        /**
         * User 4 
         * name : Polar
         * cardNum : 0000000000000003
         * hashedPin : hashed(12345!!)
         * accNum : 0000-00-0000003
         * acBalance : 829810
         * accStatus : true
         * loginFailCount : 0
         */

        u.addName("Polar");
        u.addCardNum("0000000000000003");
        u.addhashedPin(hashedPin("12345!!"));
        u.addAccNum("0000-00-0000003");
        u.addAccBalance(829810);
        u.addAccStatus(true);
        u.addLoginFailCount(0);

        /**
         * User 5
         * name : Pooh
         * cardNum : 0000000000000004
         * hashedPin : hashed(honey33)
         * accNum : 0000-00-0000003
         * acBalance : 829810
         * accStatus : true
         * loginFailCount : 0
         */

        u.addName("Pooh");
        u.addCardNum("0000000000000004");
        u.addhashedPin(hashedPin("honey33"));
        u.addAccNum("0000-00-0000004");
        u.addAccBalance(5000);
        u.addAccStatus(true);
        u.addLoginFailCount(0);
        
    }
    
}
