public class checkBalance {
    
    public static void func(User u, int clientNum, int clientAccIndex){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Account Balance : $ "+u.getAccBalance(clientNum).get(clientAccIndex));
        return;
    }
    
}
