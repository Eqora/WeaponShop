package main.java.practice2.weapon.AK47;

import main.java.practice2.weapon.Weapon;

import java.util.Objects;

/**
 * @author Lenovo on 30.09.2020
 */
public class AK47 extends Weapon {

    private int MagazineSize;

    public AK47(int price, int caliber, int MagazineSize) {
        super(price, caliber);
        this.MagazineSize = MagazineSize;
    }

    public int getMagazineSize() {
        return MagazineSize;
    }

    public void setMagazineSize(int MagazineSize) {
        this.MagazineSize = MagazineSize;
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
        AK47 that = (AK47) obj;
        return MagazineSize == that.MagazineSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MagazineSize);
    }

    @Override
    public String toString() {
        return "AK47{" +
                "Magazine size=" + MagazineSize +
                '}';
    }
}
