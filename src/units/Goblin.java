package units;
import java.util.ArrayList;
import logics.*;
/**
 * Гоблин
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */
public class Goblin extends Unit {
    public Goblin() {
        super(NameUnits.Грутаат.name(), 2, 100, 10, 20, 100, 10, 4);
    }
    @Override
    public String getInfo(){
        return "Гоблин: " + this.name
                + ", здоровье: " + this.health
                + ", скорость: " + this.moves
                + ", защита: " + this.protection
                + ", опыт: " + this.experience
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
