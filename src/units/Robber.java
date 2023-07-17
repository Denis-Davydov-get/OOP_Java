package units;
import logics.*;
import java.util.ArrayList;

/**
 * Разбойник
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * */
public class Robber extends Unit {
    public Robber() {
        super(NameUnits.Быстрый_коготь.name(), 20,100,3,10,0, 10, 3);
    }

    @Override
    public String getInfo(){
        return "Разбойник: " + name
                + ", Здоровье: " + health
                + ", damage: " + damage
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
        System.out.println(temp.name + " " + tableGame.countDistance(temp.tableGame));
    }
//    @Override
//    public void step(ArrayList<Unit> friends, ArrayList<Unit> enemies){
//        if (getHealth() == 0){return;}
//        Unit currentEnemy = nearest(friends);
//        doAttack(currentEnemy);
//    }


}
