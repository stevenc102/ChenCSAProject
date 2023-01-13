public class Battle {
    private Room room;
    private Ally[] allyList;
    private Enemy[] enemyList;
    private String[] turnOrder;
    public Battle(Room room, Ally[] allyList, Enemy[] enemyList) {
        this.room = room;
        this.allyList = allyList;
        this.enemyList = enemyList;
        String[] temp = new String[allyList.length + enemyList.length];
        Ally[] sorted = new Ally[allyList.length];
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = ArrayChecker.checkArray(allyList);
            double max = allyList[0].getSpeed();
            for (int i = 0; i < allyList.length; i ++) {
                if (allyList[i].getSpeed() > max) {
                    max = allyList[i].getSpeed();
                    allyList[i].setSpeed(0);
                    sorted[i] = allyList[i];
                }
            }
        }
        allyList = sorted;
        Enemy[] enemiesSorted = new Enemy[enemyList.length];
        boolean isSorted2 = false;
        while(!isSorted2) {
            isSorted2 = ArrayChecker.checkArray2(enemyList);
            double max = allyList[0].getSpeed();
            for (int i = 0; i < allyList.length; i ++) {
                if (allyList[i].getSpeed() > max) {
                    max = allyList[i].getSpeed();
                    enemyList[i].setSpeed(0);
                    enemiesSorted[i] = enemyList[i];
                }
            }
        }
        enemyList = enemiesSorted;
    }


}
