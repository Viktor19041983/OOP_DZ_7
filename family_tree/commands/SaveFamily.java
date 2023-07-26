package family_tree.commands;

import family_tree.Console;

public class SaveFamily extends Command {
     public SaveFamily(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить семью. ";
    }

    @Override
    public void execute() {
        getConsole().saveFamily();
    }
    
}
