public class Party {
    public Ally[] allyList;

    public Party() {
        Ally barbarian = new Ally("Bob", 30, 15, 4, "Fighter");
        Ally defender = new Ally("Defender", 50, 10, 3, "Tank");
        Ally wizard = new Ally("Wizard", 15, 20, 6, "Ranger");
        Ally priest = new Ally("Priest", 10, 20, 7, "Healer");
        Ally rogue = new Ally("Rogue", 15, 30, 20, "Specialist");
        Ally[] allyList = new Ally[4];
    }

    public void addPartyMember(Ally newAlly) {
        for (int i = 0; i < allyList.length; i ++) {
            if (allyList[i] == null) {
                allyList[i] = newAlly;
            }
        }
    }

    public void removePartyMember(Ally removedAlly) {
        for (int i = 0; i < allyList.length; i ++) {
            if (allyList[i].getName().equals(removedAlly.getName())) {
                allyList[i] = null;
            }
        }
    }


}
