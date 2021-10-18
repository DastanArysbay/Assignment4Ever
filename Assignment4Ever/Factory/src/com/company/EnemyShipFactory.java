package com.company;

public class EnemyShipFactory {
    public BrawlStars makeEnemyShip(String newShipType) {
        BrawlStars newShip = null;
        if (newShipType.equals("U")) {
            return new UFOEnemtShip();
        } else
            if (newShipType.equals("R")){
                return new RocketEnemyShip();

            }else
                if (newShipType.equals("B")){
                    return new BigBossUFOEnemyShip();
                } else return null;
    }
}

