import java.util.*;

class AccountHolder {
    private String userId;
    private String pin;

    public AccountHolder(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void transfer(Account toAccount, double amount) {
        if (amount <= balance) {
            withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

class BankTransaction {
    private Date date;
    private String description;
    private double amount;

    public BankTransaction(String description, double amount) {
        this.date = new Date();
        this.description = description;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}

class ATM {
    AccountHolder currentUser;
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void login(String userId, String pin) {
        AccountHolder accountHolder = new AccountHolder(userId, pin);
        if (isValidAccountHolder(accountHolder)) {
            currentUser = accountHolder;
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid user ID or PIN.");
        }
    }

    private boolean isValidAccountHolder(AccountHolder accountHolder) {
        // You should implement your authentication logic here.
        // For simplicity, we'll assume a hardcoded user for demonstration.
        return accountHolder.getUserId().equals("user123") && accountHolder.getPin().equals("1234");
    }

    public void showTransactionHistory(Account account) {
        // You can implement transaction history display logic here.
        // For simplicity, we'll just print a message.
        System.out.println("Transaction history for Account: " + account.getAccountNumber());
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        bank.getAccount(account.getAccountNumber()).deposit(amount);
        bankTransaction(account, "Deposit", amount);
        System.out.println("Deposit successful.");
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
        bank.getAccount(account.getAccountNumber()).withdraw(amount);
        bankTransaction(account, "Withdraw", amount);
        System.out.println("Withdrawal successful.");
    }

    public void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.transfer(toAccount, amount);
        bankTransaction(fromAccount, "Transfer to " + toAccount.getAccountNumber(), amount);
        bankTransaction(toAccount, "Transfer from " + fromAccount.getAccountNumber(), amount);
        System.out.println("Transfer successful.");
    }

    public void quit() {
        currentUser = null;
        System.out.println("Logged out. Thank you for using this ATM.");
    }

    private void bankTransaction(Account account, String description, double amount) {
        BankTransaction transaction = new BankTransaction(description, amount);
        // You can implement logic to add the transaction to the account's history here.
    }
}

public class ATMconsol {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("123456");
        Account account2 = new Account("789012");
        bank.addAccount(account1);
        bank.addAccount(account2);

        ATM atm = new ATM(bank);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (true) {
            if (atm.currentUser == null) {
                System.out.print("Enter User ID: ");
                String userId = scanner.nextLine();
                System.out.print("Enter PIN: ");
                String pin = scanner.nextLine();
                atm.login(userId, pin);
            } else {
                System.out.println("\n1. Show Transaction History");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        atm.showTransactionHistory(bank.getAccount("123456"));
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(account1, depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        atm.withdraw(account1, withdrawalAmount);
                        break;
                    case 4:
                        System.out.print("Enter recipient account number: ");
                        String recipientAccountNumber = scanner.nextLine();
                        Account toAccount = bank.getAccount(recipientAccountNumber);
                        if (toAccount != null) {
                            System.out.print("Enter transfer amount: ");
                            double transferAmount = scanner.nextDouble();
                            atm.transfer(account1, toAccount, transferAmount);
                        } else {
                            System.out.println("Recipient account not found.");
                        }
                        break;
                    case 5:
                        atm.quit();
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }
    }
}
