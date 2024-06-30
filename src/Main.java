import model.familytree.FamilyTree;
import model.human.Service;
import view.ConsoleUI;
import view.View;

import java.time.LocalDate;

import static model.human.Gender.Female;
import static model.human.Gender.Male;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}