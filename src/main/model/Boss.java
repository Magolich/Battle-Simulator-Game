package model;

// Represents a boss combatant in the game
public class Boss extends Combatant {
    private final String bossName = "DESTROYER";
    private int bossHP = 1200;
    private final int bossATK = 200;
    private final int bossDEF = 100;
    private final String bossQuote = "DIE SCUM";

    public Boss() {
        this.name = bossName;
        this.hp = bossHP;
        this.atk = bossATK;
        this.def = bossDEF;
        this.quote = bossQuote;
    }

}
