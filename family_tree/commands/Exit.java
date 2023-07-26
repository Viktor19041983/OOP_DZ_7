package family_tree.commands;

import family_tree.Console;

public class Exit extends Command {
     public Exit(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Выход их программы.";
    }

    @Override
    public void execute() {
        getConsole().end();
    }
}
