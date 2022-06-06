package Player;

public class Player {
    private int health;
    private int strength;
    private int lives;

    private int defaultHealth=100;


    public Player() {
        this.health = defaultHealth;
        this.strength = 10;
        this.lives = 3;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void reduceLive(){
        setLives(lives-1);
        setHealth(defaultHealth);
    }
    public void attack(Player player){
        player.setHealth(player.getHealth()-this.strength);

    }
}
