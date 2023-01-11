public class Enemy {
    private String name;
    private int level;
    private double health;
    private double attack;

    private double speed;
    private String specialCharacteristic;

    public Enemy(String name, int level, double health, double attack, double speed, String special) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        specialCharacteristic = special;
    }

    public double getLevel() {
        return level;
    }

    public double getHealth() {
        return level * 0.50 + health;
    }

    public double getAttack() {
        return level * 0.15 + attack;
    }

    public String getSpecial() {
        return specialCharacteristic;
    }

    public String getName() {
        return name;
    }
}