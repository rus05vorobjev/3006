package model.human;

import model.comparator.CorparatarName;
import model.familytree.FamilyTree;
import model.record.FileHandler;
import model.record.Writable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


public class Service {
    private int id;
    private FamilyTree familyTree;

    public Service() {
        this.id = id;
        this.familyTree = new FamilyTree<>();
    }

    public void createHuman(String name, Gender gender, LocalDate birthData){
        Human human = new Human(id++, name, gender, birthData);
        familyTree.addHuman(human);
    }

    public String getHumanInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Список людей\n");
        for (Object human: familyTree) {
            sb.append(human);
            sb.append("\n");
            sb.append("\n");
        }
        return sb.toString();
    }



    private void save(FamilyTree familyTree, String filePath) {
        Writable writable = new FileHandler();
        writable.save((Serializable) familyTree, filePath);
    }

    private  FamilyTree load(String filePath) {
        Writable writable = new FileHandler();
        return (FamilyTree) writable.read(filePath);
    }

    private void addToParents(Human human){
        for (Human parent: human.getParents()){
            parent.addChild(human);
        }
    }

    private void addToChild(Human human){
        for (Human child: human.getChildren()){
            child.addParent(human);
        }
    }
    public void sortName() {

        Collections.sort(familyTree.getHumans(), new CorparatarName<>());
    }


}



