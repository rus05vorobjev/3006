package model.human;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Human implements AnotherType<Human>  {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthData, deathData;
    private List<Human> parents;
    private List<Human> children;

    public Human(int id, String name, Gender gender, LocalDate birthData,
                 LocalDate deathData, Human father, Human mother) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthData = birthData;
        this.deathData = deathData;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Human(int id, String name, Gender gender, LocalDate birthData,
                 Human father, Human mother) {
        this(id, name, gender, birthData, null, father, mother);
    }

    public Human(int id, String name, Gender gender, LocalDate birthData) {
        this(id, name, gender, birthData, null,null,null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthData() {
        return birthData;
    }

    public LocalDate getDeathData() {
        return deathData;
    }

    public List<Human> getParents() {
        return parents;
    }

    public List<Human> getChildren() {
        return children;
    }
    public void addChild(Human human){
        children.add(human);
    }

    public void addParent(Human human){
        parents.add(human);
    }

    public int getPeriod(LocalDate birthData, LocalDate deathData){
        Period diff = Period.between(birthData, LocalDate.now());
        return diff.getYears();
    }

    public int getAge(){
        if(deathData == null){
            return getPeriod(birthData, LocalDate.now());

        } else return getPeriod(birthData,deathData);
    }
    public String getChildrenInfo() {
        StringBuilder sb = new StringBuilder();
        if (children.size() != 0) {
            sb.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                sb.append(", ");
                sb.append(children.get(i).getName());
            }
        } else sb.append("нет");
        return sb.toString();
    }

    public String getParentsInfo() {
        StringBuilder sb = new StringBuilder();
        if (parents.size() != 0) {
            sb.append(parents.get(0).getName());
            for (int i = 1; i < parents.size(); i++) {
                sb.append(", ");
                sb.append(parents.get(i).getName());
            }
        } else sb.append("нет");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId());
        sb.append("\nИмя: ").append(getName());
        sb.append("\nПол: ").append(getGender());
        sb.append("\nДата рождения: ").append(getBirthData());
        sb.append("\nВозраст: ").append(getAge());
        sb.append("\nРодители: ").append(getParentsInfo());
        sb.append("\nДети: ").append(getChildrenInfo());
        return sb.toString();
    }

}

