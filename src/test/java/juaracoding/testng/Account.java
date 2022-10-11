package juaracoding.testng;

public class Account {

	int acc_no;
	String name;
	double amount;

	public double insert(int a, String n, double amt) {
		acc_no = a;
		name = n;
		amount = amt;
		return amt;
	}

	public double deposit(double amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
		return amount;
	}

	public double withdraw(double amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
		return amt;
	}

	public void checkBalance() {

		System.out.println("Balance is: " + amount);
	}

	public void display() {

		System.out.println(acc_no + " " + name + " " + amount);
	}
}