package todo;

public class Coin extends GameObject{

	private static int numCoins = 0;
	private final int value;
	static String INFO = "[Coin] gives 1 coin to the player\n";

	public Coin(Game game, int x, int y){
		super(game, x, y);
		symbol = "¢";
		value = 1;
	}

	public static int getNumCoins(){
		return numCoins;
	}

	public static void reset(){
		numCoins = 0;
	}

	@Override
	public boolean doCollision() {
		return false;
	}

	@Override
	public boolean receiveCollision(Player player) {
		player.addCoin(value);
		hp = 0;
		return true;
	}

	@Override
	public boolean receiveShoot() {
		return false;
	}

	@Override
	public void onEnter() {
		numCoins++;
		numObjects++;
	}

	@Override
	public void update() {/*MUDA MUDA MUDA MUDA MUDA MUDA*/}

	@Override
	public void onDelete() {
		numCoins--;
		numObjects--;
	}
}