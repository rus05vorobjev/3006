package model.familytree;

import model.human.AnotherType;
import model.human.HumanIterator;
import model.record.FileHandler;
import model.record.Writable;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends AnotherType<T>> implements Iterable<T> {
    private List<T> humans;

    public FamilyTree() {
        this.humans = new ArrayList<>();
    }

    public List<T> getHumans() {
        return humans;
    }

    public void addHuman(T human){
        humans.add(human);
    }

    @Override
    public Iterator<T> iterator() {
        return new HumanIterator<>(humans);
    }




}
