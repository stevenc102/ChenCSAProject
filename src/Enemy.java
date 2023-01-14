public class Enemy {
    private String name;
    private int level;
    private double health;
    private double attack;

    private double speed;
    private String specialCharacteristic;

    private boolean isAlive;

    public Enemy(String name, int level, double health, double attack, double speed, String special) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        specialCharacteristic = special;
        isAlive = true;
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
    public double getSpeed() {return speed;}

    public String getSpecial() {
        return specialCharacteristic;
    }

    public String getName() {
        return name;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setIsAlive(boolean alive) {
        isAlive = alive;
    }

    public void takeDamage(double damage) {
        health -= damage;
    }
    public void setAttack(double attack) {
        this.attack = attack;
    }
}
