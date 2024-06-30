package presenter;

import model.familytree.FamilyTree;
import model.human.Gender;
import model.human.Human;
import model.human.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        this.service = new Service();
    }
    public void addHuman(String name, Gender gender, LocalDate birthData) {
        service.createHuman(name,gender,birthData);
        getHumanInfo();
    }
    public void getHumanInfo() {
        String answer = service.getHumanInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortName();
        getHumanInfo();
    }


}



