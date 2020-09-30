package main.java.practice2.people.client;

import main.java.edu.grsu.domain.weapon.Flower;
import main.java.edu.grsu.domain.client.Person;
import main.java.practice2.weapon.Weapon;

import java.util.List;
import java.util.Objects;

/**
 * @author Lenovo on 30.09.2020
 */
public class Customer extends main.java.practice2.people.Customer implements ICustomer {
    private int budget;

    public Customer(String country, int money, int population, int Power, String PresidentName,int budget) {
        super(country,money,Power, population, PresidentName);
        this.budget = budget;
    }

    @Override
    public void buyFlower(List<Weapon> weapons) {

    }

    @Override
    public void visitShop() {

    }

    @Override
    public void leaveShop() {

    }

    public int getMoney() {
        return budget;
    }

    public void setMoney(int money) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        if (!super.equals(obj)){
            return false;
        }
        Customer customer = (Customer) obj;
        return budget == customer.budget;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), budget);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "budget=" + budget +
                '}';
    }
}
