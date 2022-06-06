package Player;

public class Wizard extends Player{
    public Wizard() {
        this.setHealth(100);
        this.setStrength(10);
        this.setLives(5);
    }

    public void curar(Player player){
        player.setLives(player.getLives() + 1);
    }
}
