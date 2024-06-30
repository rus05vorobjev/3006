package model.human;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HumanIterator<T> implements Iterator<T>{
    int index;
    private List<T> humans;

    public HumanIterator(List<T> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return humans.size() > index;
    }

    @Override
    public T next() {
        return humans.get(index++);
    }
}
