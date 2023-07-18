package streams;

public class Player {
    final String name;
    final String nationalTeam;
    final String position;
    final int positiveMovements;
    final int errors;
    final int setsPlayed;
    final int setsLost;

    public Player(String name, String nationalTeam, String position, int positiveMovements, int errors, int setsPlayed, int setsLost) {
        this.name = name;
        this.nationalTeam = nationalTeam;
        this.position = position;
        this.positiveMovements = positiveMovements;
        this.errors = errors;
        this.setsPlayed = setsPlayed;
        this.setsLost = setsLost;
    }

}