package view.commands;

import view.ConsoleUI;

public class SortByName extends Command{
    public SortByName(ConsoleUI consoleUI) {
        super("Сортировать список по имени", consoleUI);
    }

    public void execute(){
        getConsoleUI().sortByName();
    }
}
