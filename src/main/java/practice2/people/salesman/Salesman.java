package main.java.practice2.people.salesman;

import main.java.edu.grsu.domain.exception.FlowerNotFoundException;
import main.java.edu.grsu.domain.weapon.Flower;
import main.java.edu.grsu.domain.client.Person;

import java.util.List;
import java.util.Objects;

/**
 * @author Lenovo on 30.09.2020
 */
public class Salesman extends Person implements ISalesman{
    private int salary;

    public Salesman(String street, int homeNumber, int room, int age, String name,int salary) {
        super(street, homeNumber, room, age, name);
        this.salary = salary;
    }

    @Override
    public void sellFlowers(List<Flower> flowers) throws FlowerNotFoundException {
        if(flowers==null)
        {
           throw new FlowerNotFoundException("There're no flowers");
        }
    }

    @Override
    public void startWorkDay() {

    }

    @Override
    public void finishWorkDay() {

    }

    @Override
    public void findFlower(Flower flower) {

    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Salesman salesman = (Salesman) o;
        return salary == salesman.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
