public class ArrayChecker {

    public static boolean checkArray(Ally[] allies) {
        for (Ally ally : allies) {
            if (ally.getSpeed() != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkArray2(Enemy[] enemies) {
        for (Enemy enemy : enemies) {
            if (enemy.getSpeed() != 0) {
                return false;
            }
        }
        return true;
    }
}
