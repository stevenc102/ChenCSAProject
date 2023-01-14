import java.util.Scanner;
public class Battle {
    private Room room;
    private Ally[] allyList;
    private Enemy[] enemyList;
    private String[] turnOrder;

    public Battle(Room room, Ally[] allyList, Enemy[] enemyList) {
        this.room = room;
        this.allyList = allyList;
        this.enemyList = enemyList;
    }

    public void startBattle() {
        Scanner scan = new Scanner(System.in);
        while(partyIsAlive() && enemiesAreAlive()) {
            for (int i = 0; i < allyList.length; i ++) {
                System.out.println(allyList[i].getName() + "is ready to act!\n");
                int action = Menu.printActionMenu();
                if (action == 1) {
                    System.out.print("Enter in the name of the enemy to attack: ");
                    String name = scan.nextLine();
                    int idx = 0;
                    boolean isFound = false;
                    while(!isFound) {
                        for (int j = 0; j < enemyList.length; j++) {
                            if (enemyList[j].getName().equals(name)) {
                                isFound = true;
                                idx = j;
                            } else {
                                System.out.print("Enter in the name of the enemy to attack: ");
                                name = scan.nextLine();
                            }
                        }
                    }
                    allyList[i].attack(enemyList[idx]);
                } else if(action == 2) {
                    System.out.println(allyList[i].getName() + " has raised their guard!");
                } else if (action == 3) {
                    if (allyList[i].getClassType().equals("Barbarian")){
                        System.out.println("WIP");
                    } else if (allyList[i].getClassType().equals("Defender")) {
                        String name2 = scan.nextLine();
                        int idx = 0;
                        boolean isFound2 = false;
                        while(!isFound2) {
                            for (int j = 0; j < enemyList.length; j++) {
                                if (enemyList[j].getName().equals(name2)) {
                                    isFound2 = true;
                                    idx = j;
                                } else {
                                    System.out.print("Enter in the name of the enemy to stun: ");
                                    name2 = scan.nextLine();
                                }
                            }
                        }
                        enemyList[idx].setAttack(0);
                    } else if (allyList[i].getClassType().equals("Wizard")) {
                        System.out.println("WIP");
                    } else if (allyList[i].getClassType().equals("Priest")) {
                        System.out.println(allyList[i].getName() + " has healed the party!");
                        allyList[0].heal(20);
                    } else if (allyList[i].getClassType().equals("Rogue")) {
                        System.out.println("WIP");
                    }

                }

            }
        }
    }

    public boolean partyIsAlive() {
        for (int i = 0; i < allyList.length; i++) {
            if(allyList[i].isAlive()) {
                return true;
            }
        }
        return false;
    }

    public boolean enemiesAreAlive() {
        for (int i = 0; i < enemyList.length; i++) {
            if(enemyList[i].isAlive()) {
                return true;
            }
        }
        return false;
    }
}
