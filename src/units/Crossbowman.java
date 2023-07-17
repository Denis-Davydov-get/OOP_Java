package units;
import logics.*;
import java.util.ArrayList;

/** Арбалетчик
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */

public class Crossbowman extends Unit {
    int dart; // стрелы
    public Crossbowman() {
        super(NameUnits.Грелль.name(), 30, 100, 10, 100, 0, 1, 3);
        this.dart = 10;
    }
    @Override
    public String getInfo(){
        return "Арбалетчик: " + name
                + ", выстрелы: " + dart
                + ", здоровье:  " + health
                + ", скорость: " + moves
                + ", защита: " + protection
                + ", опыт: " + experience
                + " координаты: " + tableGame.countDistance(tableGame);
   }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void step(ArrayList<Unit> units){
        Unit temp = nearest(units);
        System.out.println(temp.getInfo() + " " + tableGame.countDistance(temp.tableGame));
    }
//    @Override
//    public void step(ArrayList<Unit> friends, ArrayList<Unit> enemies){
//        if (getHealth() == 0){return;}
//        Unit currentEnemy = nearest(friends);
//        doAttack(currentEnemy);
//    }

}
