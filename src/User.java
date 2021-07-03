import java.util.ArrayList;

public class User {
    
    private ArrayList<String> name;
    private ArrayList<String> cardNum;
    private ArrayList<String> hashedPin;
    private ArrayList<ArrayList<String>> accNum;
    private ArrayList<ArrayList<Integer>> accBalance;
    private ArrayList<Boolean> loginStatus;
    private ArrayList<Integer> loginFailCount;

    public User(){
        name = new ArrayList<String>();
        cardNum = new ArrayList<String>();
        hashedPin = new ArrayList<String>();
        accNum = new ArrayList<ArrayList<String>>();
        accBalance = new ArrayList<ArrayList<Integer>>();
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

    public String gethashedPin(String cardHolderName) {
        return hashedPin.get(name.indexOf(cardHolderName));
    }

    public int hashedPinArraySize() {
        return hashedPin.size();
    }

    public int getHashedPinIndex(String cardNumber)  {
        return hashedPin.indexOf(cardNumber);
    }

    public ArrayList<String> getHashedPinArray(){
        return hashedPin;
    }

    // accNum handlings
    public void addAccNum(ArrayList<String> accNumbers) {
        accNum.add(accNumbers);
    }

    public ArrayList<String> getAccNumArray(int index) {
        return accNum.get(index);
    }

    public int accNumArraySize() {
        return accNum.size();
    }

    public int getAccHolderIndex(ArrayList<String> acc)  {
        return accNum.indexOf(acc);
    }

    public ArrayList<ArrayList<String>> getAcc(){
        return accNum;
    }

    // accBalance handlings
    public void addAccBalance(ArrayList<Integer> balance) {
        accBalance.add(balance);
    }

    public ArrayList<Integer> getAccBalance(int index) {
        return accBalance.get(index);
    }

    public int accBalanceArraySize() {
        return accBalance.size();
    }

    // loginStatus handlings
    public void addLoginStatus(boolean status) {
        loginStatus.add(status);
    }

    public boolean checkLoginStatus(String cardHolderName) {
        return loginStatus.get(name.indexOf(cardHolderName));
    }

    public String getLoginStatus(int index) {
        return String.valueOf(loginStatus.get(index));
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

    public int getLoginFailCount(String cardHolderName) {
        return loginFailCount.get(name.indexOf(cardHolderName));
    }

    public String getLoginFailCountByIndex(int index) {
        return Integer.toString(loginFailCount.get(index));
    }

    public int LoginFailCountArraySize() {
        return loginFailCount.size();
    }

    public void failCountUp(int index)  {
        int currentFailCount = loginFailCount.get(index);
        currentFailCount++;
        loginFailCount.set(index, currentFailCount);
    }

    public void resetCount(int index){
        loginFailCount.set(index, 0);
    }


}
