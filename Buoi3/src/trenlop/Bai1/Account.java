package trenlop.Bai1;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Ko du tien!!!");
        }
    }

    public void display() {
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

    }
}
