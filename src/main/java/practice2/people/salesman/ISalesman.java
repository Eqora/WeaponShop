package main.java.practice2.people.salesman;

import main.java.practice2.exception.WeaponNotFoundException;
import main.java.edu.grsu.domain.weapon.Flower;
import main.java.practice2.weapon.Weapon;

import java.util.List;

/**
 * @author Lenovo on 30.09.2020
 */
public interface ISalesman {
    void sellWeapons(List<Weapon> weapons) throws WeaponNotFoundException;
    void startWorkDay();
    void finishWorkDay();
    void findWeapon(Weapon weapon);
}
