import getting_to_know_the_language.objects_class_interfaces_package.herency.Bicycle;
import getting_to_know_the_language.objects_class_interfaces_package.herency.interfaces.ACMEBicycle;
import getting_to_know_the_language.objects_class_interfaces_package.herency.Bicycle;

public class BicycleDemo {
    public static void main(String[] args) {

        //create two different
        //getting_to_know_the_language.objects_class_interfaces_package.herency.Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //invoke methods on
        //those objects

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.printStates();
    }
}
