public class Ally {
    private String name;
    private double health;
    private double attack;
    private double speed;
    private String classType;
    private Item heldItem;

    private boolean isAlive;
    public Ally(String name, double health, double attack, double speed, String classType, Item heldItem) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.classType = classType;
        this.heldItem = heldItem;
        isAlive = true;
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

    public void setHeldItem(Item newHeldItem) {
        heldItem = newHeldItem;
    }

    public void setIsAlive(boolean setAlive) {
        isAlive = setAlive;
    }
    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }
}



