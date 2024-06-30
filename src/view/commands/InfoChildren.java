package view.commands;

import view.ConsoleUI;

public class InfoChildren extends Command{
    public InfoChildren(ConsoleUI consoleUI) {
        super("Указать детей", consoleUI);
    }

    public void execute(){
        getConsoleUI().addHuman();
    }
}

