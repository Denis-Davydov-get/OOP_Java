package units;
import logics.*;
import java.util.ArrayList;

/** Копейщик
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */
public class Spearman extends Unit {
    public Spearman() {
        super(NameUnits.Боткин.name(),2, 100, 10, 0, 100, 10, 1);
    }

    @Override
    public String getInfo() {
        return "Копейщик: " + name
                + ", урон: " + damage
                + ", здоровье: " + health
                + ", скорость: " + moves
                + ", защита: " + protection
                + ", опыт: " + experience + ","
                + " координаты: " + tableGame.countDistance(tableGame);
    }
    public String getName() {return name;}


    @Override
    public void step(ArrayList<Unit> units){
        Unit temp = nearest(units);
        System.out.println(temp.getInfo() + " " + tableGame.countDistance(temp.tableGame));
    }
//    @Override
//    public void step(ArrayList<Unit> friends, ArrayList<Unit> enemies) {
//
//    }
}
