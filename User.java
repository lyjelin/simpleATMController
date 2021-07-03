import java.util.ArrayList;

public class User {
    
    private ArrayList<String> name;
    private ArrayList<String> cardNum;
    private ArrayList<String> hashedPin;
    private ArrayList<String> accNum;
    private ArrayList<Integer> accBalance;
    private ArrayList<Boolean> accStatus;
    private ArrayList<Integer> loginFailCount;

    public User(){
        name = new ArrayList<String>();
        cardNum = new ArrayList<String>();
        hashedPin = new ArrayList<String>();
        accNum = new ArrayList<String>();
        accBalance = new ArrayList<Integer>();
        accStatus = new ArrayList<Boolean>();
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

    public int getUserIndexByCardNum(String cardNum)  {
        return name.indexOf(cardNum);
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

    public String gethashedPin(String cardHolderName) {
        return hashedPin.get(name.indexOf(cardHolderName));
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

    // accStatus handlings
    public void addAccStatus(boolean status) {
        accStatus.add(status);
    }

    public boolean checkAccStatus(String cardHolderName) {
        return accStatus.get(name.indexOf(cardHolderName));
    }

    public int accStatusArraySize() {
        return accStatus.size();
    }

    public void changeAccStatus(int index, boolean userStatus)  {
        accStatus.set(index, userStatus);
    }

    // loginFailCount handlings
    public void addLoginFailCount(int balance) {
        loginFailCount.add(balance);
    }

    public int getLoginFailCount(String cardHolderName) {
        return loginFailCount.get(name.indexOf(cardHolderName));
    }

    public int LoginFailCountArraySize() {
        return loginFailCount.size();
    }

    public void failCountUp(int index)  {
        int currentFailCount = loginFailCount.get(index);
        loginFailCount.set(index, currentFailCount++);
    }

    public void resetCount(int index){
        loginFailCount.set(index, 0);
    }


}
