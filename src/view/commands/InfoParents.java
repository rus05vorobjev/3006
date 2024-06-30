package view.commands;

import view.ConsoleUI;

public class InfoParents extends Command {
    public InfoParents(ConsoleUI consoleUI) {
        super("Указать родителей", consoleUI);
    }

    public void execute(){
        getConsoleUI().addHuman();
    }
}
