package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
      BrawlStars theEnemy = null;
      Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R / B)");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null){
            doStuffenemy(theEnemy);
        }else System.out.println("Enter a U, R, or B next time");

    }
    public static void doStuffenemy(BrawlStars anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
