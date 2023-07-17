package units;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        ArrayList<Unit> team1 = new ArrayList<>();
        ArrayList<Unit> team2 = new ArrayList<>();
        ArrayList<ArrayList<Unit>> allTeam = new ArrayList<>();

        Random rand = new Random();
        int teamSize = 4;
        for (int i = 0; i < teamSize; i++) {
            int val = rand.nextInt(4);
            switch (val){
                case 0:
                    team1.add(new Mage());
                    break;
                case 1:
                    team1.add(new Monk());
                    break;
                case 2:
                    team1.add(new Crossbowman());
                    break;
                case 3:
                    team1.add(new Sniper());
                    break;

            }
        }
        for (int i = 0; i < teamSize; i++) {
            int val = rand.nextInt(4);
            switch (val){
                case 0:
                    team2.add(new Spearman());
                    break;
                case 1:
                    team2.add(new Peasant());
                    break;
                case 2:
                    team2.add(new Robber());
                    break;
                case 3:
                    team2.add(new Goblin());
                    break;
            }
        }

//        allTeam.add(team1);
//        allTeam.add(team2);

        team1.forEach(n -> n.step(team2));



//    private static String getGun(){
//        String n = String.valueOf(gun.values()[new Random().nextInt(gun.values().length)]);
//        return n;
//    }

}
}
