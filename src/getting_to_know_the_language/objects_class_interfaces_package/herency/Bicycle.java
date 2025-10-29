package getting_to_know_the_language.objects_class_interfaces_package.herency;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:\s" +
                cadence + " spedd:\s" +
                speed + " gear:\s" + gear);

    }
}
