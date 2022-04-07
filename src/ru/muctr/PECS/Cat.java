package ru.muctr.PECS;

import java.util.Objects;

/**
 * @author Evgenia Skichko
 */
public class Cat extends DomesticAnimal implements Comparable<Cat>{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;
        if (obj == null||this.getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return this.getName() == cat.getName()
                && this.getAge() == cat.getAge();
    }

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
