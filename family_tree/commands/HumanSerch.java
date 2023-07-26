package family_tree.commands;

import family_tree.Console;

/**
 * HumanSerch
 */
public class HumanSerch extends Command {
    public HumanSerch(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Поиск человека по имени. ";
    }

    @Override
    public void execute() {
        getConsole().humanSearch();
    }

    
}