# simpleATMController
Implementing a Simple ATM Controller

## Requirements

1. Insert Card 
2. Enter PIN number  
3. Select Account  
4. See Balance/Deposit/Withdraw

For simplification, there are only 1 dollar bills in this world, no cents. 

Thus account balance can be represented in integer.

---

## Getting Started with : 

Friendly Notice : I used vscode studio to run ATM.java 

`git clone https://github.com/lyjelin/simpleATMController.git`

Clones ATM respiratory to local

`Run`

Assuming that your visual code has Java extentions, click `Run` button that you can see in `ATM.java` file

<img src="/img/runButton.png" alt="runBtn" width="50%"/>

1. Insert Card as **Enter Card Number** (6-digit i.e. 000000)
<img src="/img/insertCard.png" alt="insertCard" width="50%"/>
2. Enter Pin number (4-digit i.e.2017)
<img src="/img/enterPin.png" alt="enterPin" width="50%"/>
3. If pin number is invalid, the Authentication fails. The ATM system will allow client to re-enter valid pin number for 2 more times (3 times in total). If the client fails to type in correct pin for all given chances, client's card will be locked. But if user success to enter valid pin number within given chances, the login fail count will reset to zero
<img src="/img/loginFail.png" alt="loginFail" width="50%"/>
4. If pin number is correct Authentication will be successful and show account selection page. 
<img src="/img/transactionPage.png" alt="tp" width="50%"/>
5. Client can select account from list of Accounts
<img src="/img/selectAcc.png" alt="selectAcc" width="50%"/>
6. After selection, the transaction screen will be coming out. Client can :

**Check Balance**
<img src="/img/showBalance.png" alt="showBalance" width="50%"/>

**Cash Deposit**
<img src="/img/cashDeposit.png" alt="deposit" width="50%"/>

**Cash Withdrawalt**
<img src="/img/cashWithdrawal.png" alt="withdrawal" width="50%"/>

7. Client can only exit ATM service and terminate by selecting [4]
<img src="/img/exit.png" alt="exit" width="50%"/>

---
## Functions

### ATM

- Main

### authPinNum

Authentication function
- Check whether client's card status is valid
- Check if input pin number is correct 
- Allow 3 login chances 

### Hashing && HashAlgo

- Hashing creates hashing interface
- Hash client's input (= pin number) for the authentication

### checkBalance

- Allow client to check balance of selected account

### Deposit

- Allow client to add in cash into selected account

### Withdrawal

- Allow client to withdraw cash from selected account

### User

- Client Database 
- Stores client name, card number, accounts' num/balance, login status, login fail count(s)

### importClientInfo

- Read in `clientDB.txt` and store clients' information in User 

### exportClientInfo

- Stores clients' information by exporting User databse in `clientDB.txt` file