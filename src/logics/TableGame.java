package logics;


public class TableGame {
    int x, y;
    //конструктор
    public TableGame(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // расчет растояния до ближайшего противника
    public double countDistance(TableGame tableGame) {
        int dinstansX = tableGame.x - x;
        int dinstansY = tableGame.y - y;
        return Math.sqrt((dinstansX * dinstansX) + (dinstansY * dinstansY));
    }


}
