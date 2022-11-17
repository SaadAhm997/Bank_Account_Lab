public class BankAccount {

    // Properties:
    String firstName;
    String lastName;
    String dateOfBirth;
    Integer accountNumber;
    double balance;

    // Constructor:
    public BankAccount(String inputFirstName, String inputLastName, String dateOfBirth, Integer accountNum, Integer balance) {

        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNum;
        this.balance = 0;
    }

    // Getters:
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    // Setters:
    public void setFirstName(String setFirstName) {

        this.firstName = setFirstName;
    }

    public void setLastName(String setLastName) {
        this.lastName = setLastName;
    }

    public void setDateOfBirth(String setDateOfBirth) {
        this.dateOfBirth = setDateOfBirth;
    }

    public void setAccountNumber(Integer setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public void setBalance(int setBalance) {
        this.balance = setBalance;

    }

    // Deposit Method / test
    public void deposit(double deposit) {
        deposit += this.balance;
    }

    // Withdrawal Method / test
    public void withdawal(double withdrawal) {
        withdrawal += this.balance;
    }

    // Interest Method / test
    public double interest(double interest) {
        double payInterest = interest * this.balance;
        return payInterest;
    }

}


