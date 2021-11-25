package todo;

public class ClearCommand extends Command{

    private static final String NAME = "clear";

    private static final String DETAILS = "Clear [0]";

    private static final String SHORTCUT = "0";

    private static final String HELP = "Clears the road";

    public ClearCommand() {
        super(NAME, SHORTCUT, DETAILS, HELP);
    }

    @Override
    public boolean execute(Game game) {
        game.clear();
        return true;
    }
}
