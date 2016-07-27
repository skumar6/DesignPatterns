import java.util.Scanner;

/**
 * Created by Sanjeev on 7/26/2016.
 */
public class BattleGround {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ShipFactory sf = new ShipFactory();
        EnemyShip enemyship = null;
        System.out.println("what kind os ship R/U/B ?");
        while(sc.hasNextLine()){
            String userInput = sc.nextLine();
            enemyship=sf.makeEnemyShip(userInput);

            if(enemyship != null)
                doStuff(enemyship);
            else
                System.out.println("Enter a U R or B...");
        }



    }

    private static void doStuff(EnemyShip es) {
        es.displayEnemyShip();
        es.followHeroShip();
        es.enemyShipShoots();


    }
}
