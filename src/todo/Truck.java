package todo;

public class Truck extends GameObject{

    static String INFO = "[TRUCK] moves towards the player\n";

    public Truck(Game game, int x, int y) {
        super(game, x, y);
    }

    @Override
    public boolean doCollision() {
        return false;
    }

    @Override
    public boolean receiveCollision(Player player) {
        return false;
    }

    @Override
    public boolean receiveShot() {
        return false;
    }

    @Override
    public boolean receiveExplosion() {
        return false;
    }

    @Override
    public void onEnter() {

    }

    @Override
    public void update() {

    }

    @Override
    public void onDelete() {

    }
}
