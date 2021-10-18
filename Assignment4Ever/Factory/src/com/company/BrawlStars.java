package com.company;

public abstract class BrawlStars {
    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double newDamage) {
        this.amtDamage = newDamage;
    }
    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }
    public void displayEnemyShip(){
        System.out.println(getName() + " is one the screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getDamage() );
    }
}
