/**
 * Created by Sanjeev on 7/26/2016.
 */
public class ShipFactory {
    public EnemyShip makeEnemyShip(String shipType){
        if(shipType.equals("R"))
            return new RocketShip();
        else
            if(shipType.equals("U"))
                return new UfoShip();
        else
            if(shipType.equals("B"))
                return new BigUfoShip();
        else
                return null;

    }
}
