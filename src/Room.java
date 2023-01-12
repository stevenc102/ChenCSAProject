public class Room {
    private Enemy[] enemyList;

    private int roomDifficulty;
    private Enemy[] roomEnemies;
    public Room(int roomDifficulty) {
        this.roomDifficulty = roomDifficulty;
        Enemy ogre = new Enemy("Ogre", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 25, 20, 3, "Smash" ;
        Enemy troll = new Enemy("Troll", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 40, 10, 5, "Regeneration");
        Enemy wolf = new Enemy("Wolf", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 10, 5, 10, "Howl");
        Enemy spider = new Enemy("Spider", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 5, 3, 8, "Web");
        Enemy skeleton = new Enemy("Skeleton", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 15, 12, 5, "Strong Bones");
        Enemy giant = new Enemy("Giant", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 80, 35, 6, "Exhaustion");
        Enemy slime = new Enemy("Slime", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 10, 2, 3, "Split");
        Enemy bandit = new Enemy("Bandit", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 8, 18, 10, "Rob");
        Enemy dragon = new Enemy("Dragon", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 100, 25, 25, "Fire Breath");
        Enemy snake = new Enemy("Giant Snake", (int)(roomDifficulty * (int)(Math.random() * 10) + 1), 15, 3, 14, "Venom");
        Enemy[] enemyList = {ogre, troll, wolf, spider, skeleton, slime, bandit, snake};
        Enemy[] bossList = {giant, dragon};
        Enemy[] roomEnemies = new Enemy[(int) (roomDifficulty * .69) + 1];

        if (roomDifficulty == 10) {
            roomEnemies[0] = bossList[(int) (Math.random() * 2) + 1];
            for (int i = 1; i < roomEnemies.length; i++) {
                roomEnemies[i] = enemyList[(int) (Math.random() * 8)];
            }
        } else {
            for (int i = 0; i < roomEnemies.length; i++) {
                roomEnemies[i] = enemyList[(int) (Math.random() * 8)];
            }
        }
    }

    public Enemy[] getEnemyList() {
        return roomEnemies;
    }


}
