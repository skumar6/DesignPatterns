/**
 * Created by Sanjeev on 7/19/2016.
 */
public class Dog extends Animal {

    public Dog() {
        super();
        setSound("bark");
        flyingtype= new cantfly();
    }
    public void digHole(){
        System.out.println("dug hole");
    }

}
