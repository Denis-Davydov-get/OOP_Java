package units;
import java.util.ArrayList;
import logics.*;

/**
 * Маг
 * @damage  урон
 * @health;  здоровье
 * @moves;  ходы
 * @protection;  защита
 * @experience; опыт
 * @mana; магия
 * */
public class Mage extends Unit {
    double mana;
    int treatment; // лечение

    public Mage(String name, double damage, int health, int moves, int protection, int experience, int x, int y, double mana, int treatment) {
        super(name, damage, health, moves, protection, experience, x, y);
        this.mana = mana;
        this.treatment = treatment;
    }

    public Mage() {
        super(NameUnits.Хэллоусвифт.name(), 10, 100, 2, 10, 0, 1, 4);
        this.mana = 100;
        this.treatment = 15;
    }
    public double getMana() {return mana;}
    public double treatment(int treatment){ // лечение
        double newHp = treatment + health;
        if (health >= 100){
            health = 100;
        }
        return newHp; // вылеченное здоровье
    }


    @Override
    public String getInfo(){
        return "Маг: " + this.name
                + ", урон: " + this.damage
                + ", здоровье: " + this.health
                + ", скорость: " + this.moves
                + ", защита: " + this.protection
                + ", опыт: " + this.experience
                + ", кол-во маны: " + this.mana
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
