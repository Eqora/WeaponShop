package main.java.practice2.weapon;

import java.util.Objects;

/**
 * @author Lenovo on 30.09.2020
 */
public abstract class Weapon {
    private int price;
    private int caliber;

    public Weapon(int price, int length) {
        this.price = price;
        this.caliber = caliber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Weapon weapon = (Weapon) obj;
        return price == weapon.price &&
                caliber == weapon.caliber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, caliber);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "price=" + price +
                ", caliber=" + caliber +
                '}';
    }
}
