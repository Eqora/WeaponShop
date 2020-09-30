package main.java.practice2.people;

import java.util.Objects;


public abstract class Customer {
    private Organization organization;
    private int Power;
    private String PresidentName;

    public Customer(String country, int population, int money, int Power, String PresidentName) {
        this.organization = new Organization(country, population, money);
        this.Power = Power;
        this.PresidentName = PresidentName;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setAddress(Organization organization) {
        this.organization = organization;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public String getPresidentName() {
        return PresidentName;
    }

    public void setPresidentName(String PresidentName) {
        this.PresidentName = PresidentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Customer customer = (Customer) obj;
        return Power == customer.Power &&
                organization.equals(customer.organization) &&
                PresidentName.equals(customer.PresidentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, Power, PresidentName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "organization=" + organization.toString() +
                ", power=" + Power +
                ", president name='" + PresidentName + ' ' +
                '}';
    }
}

class Organization{
    private String country;
    private int population;
    private int money;

    public Organization(String country, int population, int money) {
        this.country = country;
        this.population = population;
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Organization organization = (Organization) obj;
        return money == organization.money &&
                population == organization.population &&
                Objects.equals(country, organization.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, population, money);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "country='" + country + '\'' +
                ", population=" + population +
                ", money=" + money +
                '}';
    }
}