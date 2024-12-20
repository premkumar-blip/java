package javaprogram; // Consider a bank account where multiple threads (e.g., users or automated systems) are trying to deposit and withdraw money simultaneously. We need to ensure that the balance is updated correctly without any data
	class BankAccount {
	    private int balance = 0;

	    // Synchronized method to deposit money
	    public synchronized void deposit(int amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + ", Current Balance: " + balance);
	    }

	    // Synchronized method to withdraw money
	    public synchronized void withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew " + amount + ", Current Balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds. Current Balance: " + balance);
	        }
	    }

	    // Method to check the current balance
	    public int getBalance() {
	        return balance;
	    }
	}

	class BankTransaction implements Runnable {
	    private BankAccount account;
	    private boolean isDeposit;
	    private int amount;

	    public BankTransaction(BankAccount account, boolean isDeposit, int amount) {
	        this.account = account;
	        this.isDeposit = isDeposit;
	        this.amount = amount;
	    }

	    @Override
	    public void run() {
	        if (isDeposit) {
	            account.deposit(amount);
	        } else {
	            account.withdraw(amount);
	        }
	    }
	}

	public class SynchronizedTask {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount();

	        Thread t1 = new Thread(new BankTransaction(account, true, 100));
	        Thread t2 = new Thread(new BankTransaction(account, false, 50));
	        Thread t3 = new Thread(new BankTransaction(account, true, 200));
	        Thread t4 = new Thread(new BankTransaction(account, false, 150));

	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();

	        // Wait for all threads to finish
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final Balance: " + account.getBalance());
	    }
	}
