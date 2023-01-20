package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader extends CommandExecutableFactory {
    private static TerminalReader terminalReader;

    private CommandParser commandParser;


    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public void getI(int f) {
        Scanner scan = new Scanner(System.in);
        while (true) {                      // for( ; ; )
            String command = scan.nextLine();
            String[] inp = commandParser.parseCommand(command);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(inp);
            commandExecutable.execute();
        }
    }
}
