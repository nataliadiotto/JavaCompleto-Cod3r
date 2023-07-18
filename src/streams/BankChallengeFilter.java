package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BankChallengeFilter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Client c1 = new Client("Peter Johnson", 1001, 1750.50, false);
        Client c2 = new Client("Wendy Porter", 1002, 15000.00, true);
        Client c3 = new Client("Lindsay Williams", 1003, 100.50, true);
        Client c4 = new Client("John Petras", 1004, 43550.00, false);
        Client c5 = new Client("Richard Winston", 1005, 110750.00, true);
        Client c6 = new Client("Linda Parker", 1006, 28750.50, false);

        List<Client> clients = Arrays.asList(c1, c2, c3, c4, c5, c6);

        //validation to approve credit card emission
        Predicate<Client> enoughBalance = client -> client.balance >= 10000;

        //validation to approve a black credit card
        Predicate<Client> isBlackClient = client -> client.blackClient;

        Function<Client, String> message =
                client -> "Your black credit card has been approved, " + client.name
                        + ".\nAccount number: " + client.accountNumber
                        + "\nCurrent balance: $" + client.balance + "\n";

        clients.stream()
                .filter(enoughBalance)
                .filter(isBlackClient)
                .map(message)
                .forEach(System.out::println);

    }
}
