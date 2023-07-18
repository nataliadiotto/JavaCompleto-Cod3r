package streams;

public class Client {
    final String name;
    final int accountNumber;
    final double balance;
    final boolean blackClient;

    public Client(String name, int accountNumber, double balance, boolean blackClient) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.blackClient = blackClient;
    }
}
