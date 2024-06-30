package model.human;

import java.io.Serializable;
import java.time.LocalDate;



public interface AnotherType<T> extends Serializable {

    int getId();

    int getAge();
    void addChild(T human);
    String getName();
    int getPeriod(LocalDate birthData, LocalDate deathData);
    LocalDate getBirthData();

    String getChildrenInfo();



}
