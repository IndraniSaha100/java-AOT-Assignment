package assignment4;

/**
 * 4. Assume that a bank maintains two types of account for its customers, one
 * called a savings account and other called a current account.
 * 
 * The savings account provides compound interest and withdrawal facilities but
 * no cheque book facility.
 * 
 * The current account provides a check book facility but no interest. Current
 * account holders should also maintain a minimum balance (say Rs. 1000) and if
 * the balance falls below this level a service charge is imposed (say Rs. 100).
 * 
 * Create a class Account that stores customer name, account number and type of
 * account.
 * 
 * From this class derive two classes Curr_Acct and Savn_Acct respectively to
 * make them more specific to their requirements.
 * 
 * Include the necessary methods to achieve the following tasks:
 * a. Accept deposits from a customer and update the balance.
 * b. Display the balance.
 * c. Compute and deposit interest.
 * d. Permit withdrawal and update the balance.
 * e. Check for minimum balance, impose penalty, if necessary, and
 * update the balance. Use constructors to initialize the class members.
 */
abstract class Account {
    protected String customerName;
    protected long accountNumber;
    protected String typeAccount;

    protected double balance = 0;
    protected final double minBalance = 1000;
    protected final double charge = 100;
    
    protected final double interestRate = .05;

    public Account(String customerName, long accountNumber, String typeAccount) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.typeAccount = typeAccount;
    }
    public void deposit(long money){
        balance+=money;
        System.out.println("Deposited money:"+money+"\nBalance:"+balance);
    }

    public void displayBalance(){
        System.out.println("Balance:"+balance);
    }
    abstract public void facility();
}

class Curr_Acct extends Account {

    public Curr_Acct(String customerName, long accountNumber) {
        super(customerName, accountNumber, "Current Account");
    }

    public void facility() {
        System.out.println("The current account provides a check book facility but no interest.");
    }

    private void serviceCharge() {
        System.out.println("Your balance is below "+minBalance+" so service charge "+ charge+"  is taken");
        balance -= charge;
        System.out.println("Balance:" + balance);
    }

    public void withdrawal(double amount) {
        if (balance < amount) {
            System.out.println("Withdrawal is not possible, balance is insufficient.");
            return;
        }
        balance -= amount;
        if (balance < minBalance) {
            serviceCharge();
        }
    
    }
}

class Savn_Acct extends Account {

    public Savn_Acct(String customerName, long accountNumber) {
        super(customerName, accountNumber, "Savings Account");
    }

    public void facility() {
        System.out.println(
                "The savings account provides compound interest and withdrawal facilities but no cheque book facility.");
    }


    public void calculateInterest(int year) {
        double temp=balance;
        balance = balance * Math.pow(1+interestRate, year);
        
        System.out.println("Interest is given.." + (balance-temp));
    }

    public void withdrawal(long amount) {
        if (balance < amount) {
            System.out.println("Balance is below the withdrwal amount..");
            return;
        }
        balance -= amount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Curr_Acct currAccount = new Curr_Acct("Alice", 12345);
        currAccount.deposit(1500);
        currAccount.withdrawal(600);
        currAccount.displayBalance();

        System.out.println();

        Savn_Acct savnAccount = new Savn_Acct("Bob", 67890);
        savnAccount.deposit(2000);
        savnAccount.calculateInterest(2);
        savnAccount.withdrawal(500);
        savnAccount.displayBalance();
    }
}
