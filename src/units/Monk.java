package units;//монах
import logics.*;
import java.util.ArrayList;

/**
 * Монах
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * @mana; магия
 * */
public class Monk extends Unit {
    double mana;
    public Monk() {
        super(NameUnits.Эверсон.name(), 30, 100, 10, 0, 100, 1, 2);
        this.mana = mana;
    }
    @Override
    public String getInfo(){
        return "Монах " + name
                + ", Здоровье: " + health
                + ", скорость: " + moves
                + ", защита: " + protection
                + ", опыт: " + experience
                + ", мана: " + mana
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
//    public void step(ArrayList<Unit> friends, ArrayList<Unit> enemies) {
//
//    }

}
