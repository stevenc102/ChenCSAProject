public class Ally {
    private String name;
    private double health;
    private double attack;
    private double speed;
    private String classType;
    private Item heldItem;
    private boolean isDefending;
    private boolean isAlive;
    public Ally(String name, double health, double attack, double speed, String classType, Item heldItem) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.classType = classType;
        this.heldItem = heldItem;
        isAlive = true;
        isDefending = false;
    }
    public Ally(String name, double health, double attack, double speed, String classType) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.classType = classType;
    }
    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public double getSpeed() {
        return speed;
    }

    public String getClassType() {
        return classType;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public boolean isDefending() {
        return isDefending;
    }

    public void setHeldItem(Item newHeldItem) {
        heldItem = newHeldItem;
    }

    public void setIsAlive(boolean setAlive) {
        isAlive = setAlive;
    }
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public void takeDamage(double damage) {
        if (isDefending()) {
            health -= damage / 2;
        } else {
            health -= damage;
        }
    }

    public void attack(Enemy target) {
        target.takeDamage(attack);
    }
    public void heal(double health) {
        this.health = health;
    }

}



