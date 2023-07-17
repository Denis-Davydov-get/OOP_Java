package units;
import logics.*;
import java.util.ArrayList;

/** Снайпер
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */
public class Sniper extends Unit {
    public Sniper() {
        super(NameUnits.Иствуд.name(),40 , 100, 10, 10, 100, 1, 4);
    }
    @Override
    public String getInfo(){
        return  "Снайпер: " + name
                + ", урон: " + damage
                + ", здоровье: " + health
                + ", скорость: " + moves
                + ", защита: " + protection
                + ", опыт: " + experience
                + " координаты: " + tableGame.countDistance(tableGame);
    }
    @Override
    public String getName() {
        return name;
    }

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
