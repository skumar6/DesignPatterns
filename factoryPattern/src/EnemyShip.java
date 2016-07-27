/**
 * Created by Sanjeev on 7/26/2016.
 */
public abstract class EnemyShip {

    String name;
    Double amtDamage;

    public String getName() {
        return name;
    }

    public Double getAmtDamage() {
        return amtDamage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmtDamage(Double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip(){
        System.out.println("Following hero ship...");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+" attacks and does damage "+ getAmtDamage());
    }

    public void displayEnemyShip(){
        System.out.println(getName()+" is on Screen...");
    }
}
