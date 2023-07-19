package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class VolleyballMVP {
    public static void main(String[] args) {

        Player p1 = new Player("Paola Egonu", "Italy", "Opposite Hitter", 87, 28, 43, 10);
        Player p2 = new Player("Thaisa Daher", "Brazil", "Middle blocker", 86, 11, 43, 10);
        Player p3 = new Player("Melissa Vargas", "Turkey", "Opposite hitter", 85, 37, 40, 13);
        Player p4 = new Player("Micha Hancock", "The USA", "Setter", 60, 65, 39, 10);

        List<Player> players = Arrays.asList(p1, p2, p3, p4);

        Predicate<Player> isEfficient = player -> player.positiveMovements > player.errors;
        Predicate<Player> avrgErrors = player -> player.errors <= 20;
        Predicate<Player> setAverage = player -> player.setsPlayed - player.setsLost >= 30;

        Function<Player, String> message =
                player -> "The Most Valuable Player this year is " + player.name + ", the " + player.position + " from team " + player.nationalTeam + ".\n"
                        + "Having played a total of " + player.setsPlayed
                        + " sets, she has made " + player.positiveMovements
                        + " positive movements and committed " + player.errors + " errors.";

        players.stream()
                .filter(isEfficient)
                .filter(avrgErrors)
                .filter(setAverage)
                .map(message)
                .forEach(System.out::println);



    }
}

