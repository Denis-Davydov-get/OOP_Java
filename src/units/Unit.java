package units;
import logics.*;
import java.util.ArrayList;

public abstract  class Unit implements InGameInterface {

    protected String name; // имя
    protected double damage, curHp; // урон
    protected double health; // здоровье
    protected int moves; // ходы
    protected double protection; // защита
    protected int experience; //опыт
    protected boolean isDead = false;
    TableGame tableGame;
    public Unit(String name, double damage, double health, int moves, double protection, int experience, int x, int y) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.moves = moves;
        this.protection = protection;
        this.experience = experience;
        tableGame = new TableGame(x, y);
    }

    public Unit(String name, double damage, double curHp, double health, int moves, double protection, int experience, boolean isDead, TableGame tableGame) {
        this.name = name;
        this.damage = damage;
        this.curHp = curHp;
        this.health = health;
        this.moves = moves;
        this.protection = protection;
        this.experience = experience;
        this.isDead = isDead;
        this.tableGame = tableGame;
    }

    // проверка на смерть
    public boolean deathCheck() {
        if (health == 0) {
            isDead = true;
        }
        return isDead;
    }

    // атака, принимает кому урон и возвращает с ущербом
    public void doAttack(Unit target, double damage) {
        if (target.health - damage > 0) {
            target.health -= damage;
        } else {
            isDead = true;
        }
    }

    // урон
    public void getDamage(double damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        } else {
            isDead = true;
        }
    }
    @Override
    public String getInfo() {
        return  "Класс: " + Unit.class +
                " Имя: " + this.name +
                " урон: " + this.damage +
                " жизни: " + this.health +
                " скорость: " + this.moves +
                " защита: " + this.protection +
                " опыт: " + this.experience +
                " координаты: " + tableGame;
    }

    public Unit nearest(ArrayList<Unit> units) { // считает дистанцию до ближайшего противника из списка юнитов
        double nearestDistanse = Double.MAX_VALUE; // максимальное значение хода в юните
        Unit nextEnemy = null; // ближайший враг
        for (int i = 0; i < units.size(); i++) { // проход по всем юнитам для нахождения ближайшего юнита
            if (tableGame.countDistance(units.get(i).tableGame) < nearestDistanse) { // если нашелся ближайший
                nextEnemy = units.get(i); // приравниваем его к ближайшему врагу
                nearestDistanse = tableGame.countDistance(units.get(i).tableGame);
            }
        }
        return nextEnemy;
    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit temp = nearest(units);
        System.out.println(temp.getInfo() + " " + tableGame.countDistance(temp.tableGame));
    }

}
