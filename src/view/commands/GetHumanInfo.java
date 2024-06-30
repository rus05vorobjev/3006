package view.commands;

import view.ConsoleUI;

public class GetHumanInfo extends Command {
    public GetHumanInfo(ConsoleUI consoleUI) {
        super("Получить список людей", consoleUI);
    }

    public void execute(){
        getConsoleUI().getHumanInfo();
    }
}
