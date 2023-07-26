package family_tree;

import java.util.ArrayList;
import java.util.List;

import family_tree.commands.AddHuman;
import family_tree.commands.Exit;
import family_tree.commands.FamilyPrint;
import family_tree.commands.Load;
import family_tree.commands.Option;
import family_tree.commands.SaveFamily;
import family_tree.commands.SortAge;
import family_tree.commands.SortName;

public class Menu {
    private List<Option> commands;
    private Console console;

    /**
     * @param console
     */
    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddHuman(console));
        commands.add(new FamilyPrint(console));
        commands.add((Option) new HumanSearch());
        commands.add(new SortName(console));
        commands.add(new SortAge(console));
        commands.add(new SaveFamily(console));
        commands.add(new Load(console));
        commands.add(new Exit(console));
    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t- =  Меню  = -\n\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Console getConsole() {
        return console;
    }
}
