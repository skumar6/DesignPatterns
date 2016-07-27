/**
 * Created by Sanjeev on 7/20/2016.
 */
public class Giraffe extends Creature {
    public String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public  void setName(String name) {
      this.name = name;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public void setSound(String sound) {

    }
}
