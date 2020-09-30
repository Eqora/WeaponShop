package main.java.practice2.people.client;

import main.java.edu.grsu.domain.weapon.Flower;
import main.java.practice2.weapon.Weapon;

import java.util.List;

/**
 * @author Lenovo on 30.09.2020
 */
public interface ICustomer {
    void buyFlower(List<Weapon>Weapons);
    void visitShop();
    void leaveShop();
}
