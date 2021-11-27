package todo;

public class MoveDownCommand extends Command{

    private static final String NAME = "move down";

    private static final String DETAILS = "[a]";

    private static final String SHORTCUT = "a";

    private static final String HELP = "go down";

    public MoveDownCommand() {
        super(NAME, SHORTCUT, DETAILS, HELP);
    }

    @Override
    public boolean execute(Game game) {
        game.moveDown();
        game.update();
        return true;
    }
}
