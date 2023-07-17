package units;
import logics.*;
import java.util.ArrayList;

/** Крестьянин
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */
public class Peasant extends Unit {
    public Peasant() {
        super(NameUnits.Жакаранда.name(), 10, 100, 2, 5, 0,10, 2);
    }

    public Peasant(String name, double health, double damage, int moves, double protection, int experience, int x, int y) {
        super(name, health, damage, moves, protection, experience, x, y);
    }


    @Override
    public String getInfo(){
        return "Крестьянин: " + name
                + ", Здоровье: " + health
                + ", damage: " + damage
                + ", скорость: " + moves
                + ", защита: " + protection
                + ", опыт: " + experience
                + " координаты: " + tableGame.countDistance(tableGame);
    }
    @Override
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
