/**
 * Created by Sanjeev on 7/20/2016.
 */
public class PlayWithAnimals {

    public static void main(String[] args){
        Dog fido = new Dog();
        fido.setName("fido");


        fido.setWeight(-1);
        fido.digHole();

        Animal doggy = new Dog();
        Animal kitty = new Cat();
        Animal[] animal = new Animal[4];
        animal[0]=doggy;
        animal[1]= kitty;
        System.out.println("Doggy says: "+animal[0].getSound());
        System.out.println("Kitty says: "+animal[1].getSound());

        speakAmimal(doggy);
        kitty.getSound();

        Giraffe g = new Giraffe();
        g.setName("Frank");
        System.out.println("Giraffe says: "+g.getName());

    }

    public static void speakAmimal(Animal randAnimal){
        System.out.println("Doggy says: "+randAnimal.getSound());
    }

}
