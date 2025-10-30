package getting_to_know_the_language.objects_class_interfaces_package.herency;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence:\s" +
                cadence + " spedd:\s" +
                speed + " gear:\s" + gear);

    }
}
