package es.ucm.tp1.supercars.logic.gameobjects;

import es.ucm.tp1.supercars.logic.Game;

public class Truck extends Obstacle{

    public static String INFO = "[TRUCK] moves towards the player\n";

    public Truck(Game game, int x, int y) {
        super(game, x, y);
        symbol = "←";
        hp = 1;
    }

    public static void reset(){

    }

    @Override
    public void onEnter() {
        numObs++;
    }

    @Override
    public void update() {
        x--;
    }

    @Override
    public void onDelete() {
        numObs--;
    }
}
