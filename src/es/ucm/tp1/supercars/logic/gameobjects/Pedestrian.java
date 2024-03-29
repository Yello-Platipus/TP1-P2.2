package es.ucm.tp1.supercars.logic.gameobjects;

import es.ucm.tp1.supercars.logic.Game;

public class Pedestrian extends Obstacle{

    public static String INFO = "[PEDESTRIAN] person crossing the road up and down\n";

    private boolean movingUp;

    public Pedestrian(Game game, int x, int y) {
        super(game, x, y);
        symbol = "☺";
        movingUp = false;
    }

    @Override
    public boolean receiveCollision(Player player) {
        player.zeMato();
        hp--;
        game.punishPlayer();
        return true;
    }

    @Override
    public boolean receiveShot() {
        hp--;
        game.punishPlayer();
        return true;
    }

    public static void reset(){

    }

    @Override
    public void onEnter() {
        numObs++;
    }

    @Override
    public void update() {
        if(movingUp)
            y--;
        else
            y++;
        if(y == 0 || y == game.getWidth() - 1)
            movingUp = !movingUp;
    }

    @Override
    public void onDelete() {
        numObs--;
    }
}
