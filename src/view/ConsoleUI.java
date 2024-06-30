package view;

import model.comparator.CorparatarName;
import model.human.Gender;
import presenter.Presenter;

import java.awt.*;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new Menu(this);
    }


    @Override
    public void start() {
        while (work) {
            System.out.println(menu.menu());
            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);
            menu.execute(choice);
        }

    }
    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    public void addHuman(){
        System.out.print("Укажите имя: ");
        String name = scanner.nextLine();
        System.out.print("Укажите пол. Male или Female: ");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.println("Укажите дату рождения(год, месяц, число): ");
        LocalDate birthData = LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        scanner.nextLine();
        presenter.addHuman(name,gender,birthData);
    }

    public void finish() {
        work = false;
    }

    public void sortByName() {
        presenter.sortByName();
    }
    

    public void getHumanInfo() {
        presenter.getHumanInfo();
    }



}

