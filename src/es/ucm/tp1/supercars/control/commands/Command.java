package es.ucm.tp1.supercars.control.commands;

import es.ucm.tp1.supercars.logic.Game;

public abstract class Command {

	protected static int MAX_OBJ_ID = 5;
	protected static int MIN_OBJ_ID = 1;

	private static final String UNKNOWN_COMMAND_MSG = "Unknown command";

	protected static final String INCORRECT_NUMBER_OF_ARGS_MSG = "Incorrect number of arguments";

	/* @formatter:off */
	private static final Command[] AVAILABLE_COMMANDS = {
		new HelpCommand(),
		new InfoCommand(),
		new UpdateCommand(),
		new MoveUpCommand(),
		new MoveDownCommand(),
		new ExitCommand(),
		new ResetCommand(),
		new TestCommand(),
		new ShootCommand(),
		new GrenadeCommand(),
		new WaveCommand(),
		new ClearCommand(),
		new CheatCommand()
	};
	/* @formatter:on */

	public static Command getCommand(String[] commandWords) {
		Command command = null;
		int i = 0;
		while(i < AVAILABLE_COMMANDS.length && command == null){
			command = AVAILABLE_COMMANDS[i].parse(commandWords);
			i++;
		}
		if(command == null)
			System.out.format("[ERROR]: %s%n%n", UNKNOWN_COMMAND_MSG);
		return command;
	}

	private final String name;

	private final String shortcut;

	private final String details;

	private final String help;

	public Command(String name, String shortcut, String details, String help) {
		this.name = name;
		this.shortcut = shortcut;
		this.details = details;
		this.help = help;
	}

	protected String getDetails(){
		return details;
	}

	protected String getHelp(){
		return help;
	}

	public abstract boolean execute(Game game);

	protected boolean matchCommandName(String name) {
		return this.shortcut.equalsIgnoreCase(name) || this.name.equalsIgnoreCase(name);
	}

	protected Command parse(String[] words) {
		if (matchCommandName(words[0])) {
			if (words.length != 1) {
				System.out.format("[ERROR]: Command %s: %s%n%n", name, INCORRECT_NUMBER_OF_ARGS_MSG);
				return null;
			} else {
				return this;
			}
		}
		return null;
	}

	protected static Command[] getAvailableCommands(){
		return AVAILABLE_COMMANDS;
	}
}
