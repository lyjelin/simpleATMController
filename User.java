import java.util.ArrayList;

public class User {
    
    private ArrayList<String> name;
    private ArrayList<String> cardNum;
    private ArrayList<String> hashedPin;
    private ArrayList<String> accNum;
    private ArrayList<Integer> accBalance;
    private ArrayList<Boolean> loginStatus;
    private ArrayList<Integer> loginFailCount;

    public User(){
        name = new ArrayList<String>();
        cardNum = new ArrayList<String>();
        hashedPin = new ArrayList<String>();
        accNum = new ArrayList<String>();
        accBalance = new ArrayList<Integer>();
        loginStatus = new ArrayList<Boolean>();
        loginFailCount = new ArrayList<Integer>();
    }

    // username handlings
    public void addName(String cardHolderName) {
        name.add(cardHolderName);
    }

    public String getName(int index) {
        return name.get(index);
    }

    public int nameArraySize() {
        return name.size();
    }

    public int getUserIndex(String cardHolderName)  {
        return name.indexOf(cardHolderName);
    }

    // cardNum handlings
    public void addCardNum(String cardNumber) {
        cardNum.add(cardNumber);
    }

    public String getCardNum(int index) {
        return cardNum.get(index);
    }

    public int cardNumArraySize() {
        return cardNum.size();
    }

    public int getCardNumIndex(String cardNumber)  {
        return cardNum.indexOf(cardNumber);
    }

    // hashedPin handlings
    public void addhashedPin(String pinNum) {
        hashedPin.add(pinNum);
    }

    public String gethashedPin(int index) {
        return hashedPin.get(index);
    }

    public int hashedPinArraySize() {
        return hashedPin.size();
    }

    public int getHashedPinIndex(String cardNumber)  {
        return hashedPin.indexOf(cardNumber);
    }

    // accNum handlings
    public void addAccNum(String accNumber) {
        accNum.add(accNumber);
    }

    public String getAccNum(int index) {
        return accNum.get(index);
    }

    public int accNumArraySize() {
        return accNum.size();
    }

    public int getAccNumIndex(String accNumber)  {
        return accNum.indexOf(accNumber);
    }

    // accBalance handlings
    public void addAccBalance(int balance) {
        accBalance.add(balance);
    }

    public int getAccBalance(int index) {
        return accBalance.get(index);
    }

    public int accBalanceArraySize() {
        return accBalance.size();
    }

    public void changeAccBalance(int index, int balance)  {
        accBalance.set(index, balance);
    }

    // loginStatus handlings
    public void addLoginStatus(boolean status) {
        loginStatus.add(status);
    }

    public String getLoginStatus(int index) {
        return accNum.get(index);
    }

    public int loginStatusArraySize() {
        return loginStatus.size();
    }

    public void changeLoginStatus(int index, boolean userStatus)  {
        loginStatus.set(index, userStatus);
    }

    // loginFailCount handlings
    public void addLoginFailCount(int balance) {
        loginFailCount.add(balance);
    }

    public int getLoginFailCount(int index) {
        return loginFailCount.get(index);
    }

    public int LoginFailCountArraySize() {
        return loginFailCount.size();
    }

    public void changeLoginFailCount(int index, int balance)  {
        loginFailCount.set(index, balance);
    }


}
