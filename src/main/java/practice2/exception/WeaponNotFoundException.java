package main.java.practice2.exception;

/**
 * @author Lenovo on 30.09.2020
 */
public class WeaponNotFoundException extends Exception{
    public WeaponNotFoundException(String message)
    {
        super(message);
    }
}
