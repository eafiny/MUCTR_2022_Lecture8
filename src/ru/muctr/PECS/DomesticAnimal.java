package ru.muctr.PECS;

/**
 * @author Evgenia Skichko
 */
public class DomesticAnimal extends Animal{
    private String name;

    public DomesticAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
