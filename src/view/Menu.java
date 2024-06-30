package view;

import view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;

    public Menu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddHuman(consoleUI));
        commands.add(new GetHumanInfo(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new InfoParents(consoleUI));
        commands.add(new InfoChildren(consoleUI));
        commands.add(new Finish(consoleUI));
    }
    public String menu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            sb.append(i + 1).append(". ");
            sb.append(commands.get(i).getDescription());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void execute(int choice){
        Command command = commands.get(choice - 1);
        command.execute();
    }
}
