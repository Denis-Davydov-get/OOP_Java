package logics;

import units.*;

import java.util.ArrayList;

public interface InGameInterface {
//    void step(ArrayList<Unit> friends, ArrayList<Unit> enemies);
    String getInfo();
    String getName();

    void step(ArrayList<Unit> units);
}

