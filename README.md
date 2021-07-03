# simpleATMController
Implementing a Simple ATM Controller

### Requirements

1. Insert Card 
2. Enter PIN number  
3. Select Account  
4. See Balance/Deposit/Withdraw

For simplification, there are only 1 dollar bills in this world, no cents. 

Thus account balance can be represented in integer.

---

### Getting Started with : 

1. Insert Card as **Enter Card Number** (6-digit i.e. 000000)
2. Enter Pin number (4-digit i.e.2017)
3. If pin number is invalid, the Authentication fails. The ATM system will allow client to re-enter valid pin number for 2 more times (3 times in total). If the client fails to type in correct pin for all given chances, client's card will be locked. But if user success to enter valid pin number within given chances, the login fail count will reset to zero
4. If pin number is correct Authentication will be successful and show account selection page. 
5. Client can select account from list of Accounts
6. After selection, the transaction screen will be coming out. Client can :
    ```
    [1] Check Balance
    [2] Cash Deposit
    [3] Cash Withdrawal
    [4] Exit
    ```
7. Client can only exit ATM service and terminate by selecting [4]