/**
 * Created by Sanjeev on 7/20/2016.
 */
public class Playing {

    public static void main(String[] args){
        System.out.print("here");
        Animal doggy = new Dog();
        Animal twity = new Bird();
        System.out.println(doggy.flyingProp());
        System.out.println(twity.flyingProp());
        doggy.changeFlyingProp(new itfly());

        System.out.println(doggy.flyingProp());
    }
}
